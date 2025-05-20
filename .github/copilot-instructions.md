# Copilot Instructions

This project is a web application that allows users to create and manage tasks. The application is built using React and Node.js, and it uses MongoDB as the database.

## Java Coding Standards

- Use camelCase for variable, method, and parameter names.
- Use PascalCase for class and interface names.
- Use 4 spaces for indentation.
- Use braces `{}` for all code blocks, even single-line blocks.
- Use `final` for constants and variables that should not be reassigned.
- Use descriptive names for classes, methods, and variables.
- Place each class in its own file.
- Use Javadoc comments for public classes and methods.
- Organize imports: standard Java, third-party, then project-specific.
- Avoid wildcard imports.
- Keep lines under 120 characters.
- Use annotations (e.g., `@Override`, `@RestController`) where appropriate.
- Follow standard Java conventions for spacing and formatting.
- Annotate all Java REST endpoints with Swagger/OpenAPI annotations (e.g., `@Operation`, `@ApiResponse`, `@Tag`) to generate API documentation.
- Ensure Swagger/OpenAPI documentation is kept up to date as endpoints are added or changed.
- For every code change, write all related tests in a test file.
- Update the README.md file whenever necessary to reflect changes in features, endpoints, setup, or usage.
- When updating endpoints, create or update the corresponding Postman request inside the /postman folder.

## Workflow and Automation Instructions

- When asked to commit staged files, automatically generate a descriptive commit message summarizing the changes, and use it in the commit command.
    - If the user mentions "fix", "fixes", or "fixing", use a commit message starting with `fix:` followed by a summary of the fix.
    - If the user mentions "feature", "add", or "adding", use a commit message starting with `feat:` followed by a summary of the feature.
    - If the user mentions "refactor", use a commit message starting with `refactor:` followed by a summary of the refactor.
    - If the user mentions "docs" or documentation, use a commit message starting with `docs:` followed by a summary of the documentation change.
    - If the user mentions "test" or "tests", use a commit message starting with `test:` followed by a summary of the test change.
    - Otherwise, generate a clear and descriptive commit message based on the context.
- When asked to push, always check the current branch and push to that branch.
- When API endpoints are added or changed, update the Mermaid diagram in `docs/api-diagram.md` to reflect the current API structure.
- When asked to create a branch, automatically generate a branch name based on the context of the request, using dashes to separate words (e.g., `feature-add-service-layer`).
    - If the user mentions "fix", "fixes", or "fixing", use a branch name starting with `fix-` followed by a context-based description (e.g., `fix-bug-in-controller`).
    - If the user mentions "feature", "add", or "adding", use a branch name starting with `feature-` followed by a context-based description (e.g., `feature-add-service-layer`).
    - If the user mentions "refactor", use a branch name starting with `refactor-` followed by a context-based description (e.g., `refactor-controller-logic`).
    - If the user mentions "docs" or documentation, use a branch name starting with `docs-` followed by a context-based description (e.g., `docs-update-readme`).
    - If the user mentions "test" or "tests", use a branch name starting with `test-` followed by a context-based description (e.g., `test-add-service-tests`).
    - Otherwise, generate a clear and descriptive branch name based on the context, using dashes to separate words.