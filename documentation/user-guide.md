# User guide

## Getting started

To run the application, you'll need to have [Java](https://www.java.com/) installed on your computer. You can then download the latest .jar file from the [releases](https://github.com/jarkmaen/maze-solver/releases/tag/v1.0.0) page and run it directly.

Alternatively, if you want to run the application from the source code, refer to the [Command line operations](../README.md#command-line-operations) section of the README.

## User interface

The user interface is divided into two sections. On the left is a control panel used to operate the application. On the right is a visualization area where the generated mazes and their solution paths are displayed.

<img src="images/user_interface.png">

### Control panel

The control panel is divided into three sections:

- The first section lets you choose the size of the maze from a dropdown menu (ranging from 5x5 up to 100x100) and generate it by pressing the "Generate maze" button. Enabling the "Animate generation" option allows you to see the maze being built step by step.
- The second section contains the algorithms for solving the maze. The two available options are "Wall follower" and "Dead-end filling". With the "Animate algorithm" option enabled, you can visualize the solving process in real time instead of displaying the solution instantly.
- The third section handles performance testing. By pressing the "Performance test" button, a benchmark is executed to measure how long the algorithms take to solve mazes of different sizes. The results are printed in the text area below the button.
