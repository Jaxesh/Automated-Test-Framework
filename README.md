# Automated Test Framework

This project demonstrates an automated test framework using Selenium and JUnit, integrated with Jenkins for continuous integration and Splunk for monitoring.

## Setup

1. **Dependencies**: Ensure you have `Maven` and `Chromedriver` installed.
2. **Configuration**: Update `path/to/chromedriver` in `TestBase.java`.

## Running Tests

- **Local**: `mvn test`
- **Jenkins**: The Jenkins pipeline will automatically build and run tests.

## Monitoring

- Configure and use Splunk to monitor test execution and health.
