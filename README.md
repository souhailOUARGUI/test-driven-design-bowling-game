# Bowling Game - Test Driven Development

## Project Description

This is a Java implementation of a bowling score calculator built using **Test-Driven Development (TDD)** principles. The project demonstrates clean code practices and TDD methodology by implementing the classic bowling game scoring kata.

## Features

The `BowlingGame` class calculates bowling scores according to standard ten-pin bowling rules:
- **Gutter Game**: All rolls are 0, score is 0
- **Spare Scoring**: When all 10 pins are knocked down in two rolls, the next roll is added as a bonus
- **Strike Scoring**: When all 10 pins are knocked down in one roll, the next two rolls are added as bonus
- **Variable Arguments**: Supports rolling multiple pins at once using varargs

## Technology Stack

- **Java 17**
- **Maven** - Build and dependency management
- **JUnit 5** (v5.10.0) - Testing framework
- **AssertJ** (v3.0.0) - Fluent assertion library

## Project Structure

```
bowling-game-test-driven-dev/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── BowlingGame.java
│   └── test/
│       └── java/
│           └── BowlingGameTest.java
├── pom.xml
└── README.md
```

## Running the Tests

To run the test suite:

```bash
mvn test
```

To compile and package:

```bash
mvn clean package
```

## Test Cases

The project includes comprehensive test cases:
1. **canMakeGame** - Verifies game instantiation
2. **canMakeGutterGame** - Tests a game with all zero rolls
3. **canScoreSpareFollowedByThree** - Tests spare bonus calculation
4. **canScoreStrikeFollowedByThreeThenThree** - Tests strike bonus calculation

## TDD Approach

This project follows the Red-Green-Refactor cycle:
1. **Red**: Write a failing test
2. **Green**: Write minimal code to pass the test
3. **Refactor**: Improve code while keeping tests green

## License

This project is for educational purposes.

