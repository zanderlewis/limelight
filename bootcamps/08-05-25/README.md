# Bootcamp 2 Homework
This folder contains the homework assignment for the second Java Bootcamp.

## Changes from Bootcamp 1
- Used `enum` to define segment types.

## Output
```
10.0
1.0
Claw attached to arm segment with ID: end
Robot created with segments:
  - BASE segment with ID: base, length: 100.0mm, extension: 0.0mm, angle: 0.0deg
  - FIXED segment with ID: middle, length: 80.0mm, extension: 0.0mm, angle: 0.0deg
  - FIXED segment with ID: end, length: 60.0mm, extension: 0.0mm, angle: 0.0deg
Claw end is opening.
Claw state: Open
Claw end is closing.
Claw state: Closed
Moving forward by 100.0 mm.
Turning left by 90.0 degrees.
Rotating base by 45.0 degrees.
Extending segment of id middle by 50.0 mm.
Extending segment of id end by 30.0 mm.
Updated arm segment states:
  - BASE segment with ID: base, length: 100.0mm, extension: 0.0mm, angle: 45.0deg
  - FIXED segment with ID: middle, length: 80.0mm, extension: 50.0mm, angle: 0.0deg
  - FIXED segment with ID: end, length: 60.0mm, extension: 30.0mm, angle: 0.0deg
Retracting segment of id end by 20.0 mm.
After retraction:
  - FIXED segment with ID: end, length: 60.0mm, extension: 10.0mm, angle: 0.0deg
```
