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

## REST API Endpoints

This project includes a sample controller for demonstration purposes:

### GenericController

- **GET /testing123**: Returns a confirmation message.
- **POST /testing123**: Accepts a string in the request body and returns a confirmation message with the input.
- **PUT /testing123**: Accepts a string in the request body and returns a confirmation message with the input.

All endpoints are documented with Swagger/OpenAPI annotations.

### TestController

- **GET /api/test**: Returns a test string.
- **GET /api/test/another**: Returns another test string.
- **GET /api/test/timestamp**: Returns a test message with the current timestamp.
- **POST /api/test**: Accepts a string in the request body and returns a confirmation message with the input.

## Testing

Related tests for the GenericController endpoints are provided in `GenericControllerTest.java`.

## Git Ignore

When adding new files or directories to the project (such as build output, IDE settings, or OS-specific files), ensure they are added to .gitignore if they should not be tracked by Git. This includes files like target/, .DS_Store, node_modules/, and IDE configuration folders.

# When asked to commit staged files, automatically generate a descriptive commit message summarizing the changes, and use it in the commit command.
# When asked to push, always check the current branch and push to that branch.
