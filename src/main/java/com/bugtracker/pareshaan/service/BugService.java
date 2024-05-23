package com.bugtracker.pareshaan.service;

import com.bugtracker.pareshaan.mapper.BugMapper;
import com.bugtracker.pareshaan.model.Bug;
import com.bugtracker.pareshaan.payload.BugDto;
import com.bugtracker.pareshaan.repository.BugRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class BugService {

    @PersistenceContext
    private final EntityManager entityManager;

    private final BugRepository bugRepository;

    public BugDto saveBug(BugDto bug) {

        return BugMapper.Instance.bugToBugDto(bugRepository.save(BugMapper.Instance.bugDtoToBug(bug)));
    }

    public Bug getBug(Long id) {
        return bugRepository.findById(id).orElse(null);
    }

    public void deleteBug(Long id) {
        bugRepository.deleteById(id);
    }

    public List<Bug> getAllBugs() {
        return bugRepository.findAll();
    }

    public BugDto updateBug(BugDto bugDto) {
        bugRepository.findById(bugDto.getId()).orElseThrow();
        Bug bug = bugRepository.save(BugMapper.Instance.bugDtoToBug(bugDto));
        return BugMapper.Instance.bugToBugDto(bug);
    }

    public List<BugDto> findAllBugsByFilter(Map<String, String> filter) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Bug> cq = cb.createQuery(Bug.class);

        Root<Bug> bug = cq.from(Bug.class);

        Predicate summary = cb.equal(bug.get("summary"), filter.get("summary"));
        Predicate id = cb.equal(bug.get("id"), filter.get("id"));

        cq.where(summary, id);

        TypedQuery<Bug> bugTypedQuery = entityManager.createQuery(cq);

        return bugTypedQuery.getResultList().stream().map(BugMapper.Instance::bugToBugDto).toList();
    }
}
