# Testing

The application was tested both manually and with JUnit tests during development. The performance of both maze solving algorithms was also benchmarked.

## Unit testing

### Application logic

The tests in the logic package cover maze generation and both the wall follower and the dead-end filling algorithms. The main focus of the unit tests is to verify that the algorithms always produce a correct solution.

### Util classes

The ArrayList, Pair and RandomNumberGenerator classes are tested to make sure they work correctly. Since these standard utility classes were built from scratch for this project, verifying their reliability is important.

### Test coverage

The test coverage was measured using JaCoCo. The line coverage for the application is 97% and the branch coverage is 94%. Both the UI code and the performance test code are excluded from the coverage report.

<img src="images/test_coverage.png">

## Performance testing

Performance testing was done to measure the runtime of the maze solving algorithms on mazes of increasing size. Mazes were pregenerated to make sure that only the solving time was measured. The results below show the execution times for both the wall follower and the dead-end filling algorithms:

| Maze size | Wall follower | Dead-end filling |
| --------- | :-----------: | :--------------: |
| 100x100   |      7ms      |       3ms        |
| 250x250   |      7ms      |       9ms        |
| 500x500   |      9ms      |       19ms       |
| 750x750   |     121ms     |       49ms       |
| 1000x1000 |     76ms      |       72ms       |
| 2500x2500 |     403ms     |      494ms       |

Notably, the wall follower algorithm was faster in a 1000x1000 maze than in a 750x750 maze. This suggests that its execution time is dependent on the maze structure and the length of the path taken. The dead-end filling algorithm on the other hand shows a more consistent increase in execution time as the maze size grows.
