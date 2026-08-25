# MSA-Study Convention Guidelines

해당 프로젝트의 모든 개발 관례는 아래 규칙을 따른다.
해당 프로젝트는 개인 프로젝트이지만 개발의 편의성과 쾌적성을 위하여 이 문서를 통해 프로젝트 전반의 개발 관례를 정의한다.

## 1. 브랜치 명명 규칙 (Branch Naming Strategy)

### 형식 (Format)
`prefix/#<이슈-번호>-<짧은-설명>`

### 브랜치 접두사 (Prefix)
- `develop/`: 개발 내용 통합
- `feature/`: 새로운 기능 개발
- `fix/`: 버그 수정
- `docs/`: 문서 작성 및 수정
- `refactor/`: 리팩토링 작업
- `chore/`: 단순 설정 변경, 의존성 업데이트 등

### 예시
- `feat/#PIT-11-commit-convention`
- `fix/#PIT-10-infra-setup`

---

## 2. 커밋 메시지 컨벤션 (Commit Convention)

### 형식 (Format)
```
<type>(<scope>): <subject>

<body>

<footer>
```

### 커밋 타입 (`type`)
- **feat**: 새로운 기능 추가
- **fix**: 버그 수정
- **docs**: 문서 수정 (README.md, CONTRIBUTING.md 등)
- **style**: 코드 스타일 변경 (비즈니스 로직 변경 없는 공백, 포맷 수정 등)
- **refactor**: 리팩토링 (동작 변경 없는 코드 구조 변경)
- **test**: 테스트 코드 추가/수정
- **chore**: 빌드 태스크, 의존성 수정 등 코드 변경이 없는 작업
- **ci**: CI 설정 파일 및 스크립트 수정
- **rename**: 파일/폴더 이동 또는 이름 변경
- **remove**: 파일/폴더 삭제

### 예시
```
feat(auth): 카카오 소셜 로그인 구현

- OAuth2 인증 API 엔드포인트 연동
- JWT 토큰 발급 및 만료 처리 로직 설계

Refs: #PIT-123
```
