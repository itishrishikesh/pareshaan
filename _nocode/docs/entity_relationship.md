There'll be five key entities of our system,
1. **User**
2. **Bug**
3. **Attachment**
4. **Comment**

Entity Relationship diagram:
```mermaid
erDiagram
    User {
        int id PK
        string email
        string username
    }
    Bug {
        int id PK
        string title
        string description
        string observed_result
        string expected_result
        int user_id FK
        int attachment_id FK
        int project
    }
    Comment {
        int id PK
        int bug_id FK
        int user_id FK
        int attachment_id FK
        string comment
    }
    Attachment {
        int id PK
        int bug_id FK
        string attachment_url
    }
    Bug |{--|| User : "assigned"
    Bug ||--}o Comment : "have"
    Bug ||--}o Attachment : "have"
    User o{--}| Comment : "have"
    Comment ||--}o Attachment : "have"
```

Guidelines for future development:
- Always use snake case for naming for any column/table name.