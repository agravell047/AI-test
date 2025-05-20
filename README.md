# AI Test

This repository is used for testing different AI tools.  
It serves as a sandbox environment to experiment with, evaluate, and compare various AI assistants and automation solutions.

## Purpose

The main goal of this repository is to provide a flexible and open environment for:
- Testing code generation and completion capabilities of AI tools
- Comparing outputs from different AI assistants
- Experimenting with automation, refactoring, and code review features
- Sharing findings and best practices related to AI-assisted development

## Usage

You can use this repository to:
- Run experiments with your preferred AI tools
- Add sample code, prompts, and test cases
- Track and document results from different AI models

Feel free to create branches or folders for specific tools or experiments.

## Contribution

Contributions are welcome!  
If you have ideas for new experiments, want to share results, or improve the setup, please open an issue or submit a pull request.

## License

This repository is for testing and educational purposes only.

## Service Layer

This project now includes a service layer for business logic. The `TestService` class is used by `TestController` to provide the response for the `/api/test` endpoint. This separation improves maintainability and testability.

- `TestService#getTestString()` is called by `TestController#getTestString()`.
- The API diagram in `docs/api-diagram.md` has been updated to reflect this relationship.
