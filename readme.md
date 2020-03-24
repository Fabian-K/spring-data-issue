Running `mvn test` fails with `java.lang.IllegalArgumentException: Validation failed for query for method public abstract java.util.List org.example.repo.BaseRepository.customQuery(java.lang.String)!` and `org.hibernate.QueryException: could not resolve property: field of: org.example.model.Base [SELECT b FROM org.example.model.Base b where b.middle.target.field = :value]` when using
- Spring Boot 2.2.0.RELEASE
- Spring Boot 2.2.5.RELEASE
- Spring Boot 2.3.0.M3                              

It works with
- Spring Boot 2.1.13.RELEASE

It also works when
- renaming `Middle.key` to `Middle.id` and `MiddleId.key` to `MiddleId.id`
- not using a Composite ID for `Middle`
