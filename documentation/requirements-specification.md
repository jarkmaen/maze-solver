# Requirements specification

The objective of this project is to build a maze solver application that generates random mazes using a DFS algorithm. These mazes can then be solved using either the wall follower or the dead-end filling algorithm. A core feature of the application is the real time visualization of both the generation and solving processes.

## Basic functionality

### Main view

- When the application opens, the main view is displayed. It consists of two sections:
    - A control panel on the left side.
    - A maze visualization area on the right side.

### Control panel

- The size of the maze can be selected using a dropdown menu.
    - The available dimensions are: 5x5, 10x10, 20x20, 30x30, 40x40, 50x50, 75x75 and 100x100.
- A randomly generated maze is created when the user presses the "Generate maze" button.
- There are two maze solving algorithms to choose from:
    - Wall follower.
    - Dead-end filling.
- Maze generation and solving can be animated, showing the algorithms executing step by step.
- A performance test can be run to benchmark the execution times of both algorithms across different maze sizes.
    - The benchmark results are outputted directly to the control panel.

### Maze

- The maze is generated using a DFS algorithm.
- The generated maze always has a single solution (a perfect maze).
- The entrance is always at the top left corner and the exit is always at the bottom right corner.
