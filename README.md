## A call center with limited agents

# Overview

This Python script simulates a call center with a limited number of agents. It models incoming customer calls, agent availability, and waiting queues. The simulation tracks:

Average wait time

Maximum wait time

Number of calls that had to wait

It also generates charts showing the effect of different agent counts on these metrics.

# Requirements

• Python 3.x

• matplotlib library

Install dependencies using:

``` pip install matplotlib

# Running the Simulation

1. Open call_center_simulation.py in your IDE or text editor.

2. (Optional) Adjust simulation parameters at the top of the script:

```python
total_calls = 30
min_call_time = 2
max_call_time = 10
min_arrival_gap = 1
max_arrival_gap = 4
agents_list = [2, 3, 5]

3. Run the script:
python call_center_simulation.py

4. View results in the console and charts saved as PNG files.

# Outputs

Console Summary for each scenario:

• Total calls handled

• Number of agents

• Average wait time

• Maximum wait time

• Number of calls that waited

Charts (PNG files):

• average_wait_time_chart.png – Average Wait Time vs Number of Agents

• maximum_wait_time_chart.png – Maximum Wait Time vs Number of Agents

• calls_waited_chart.png – Number of Calls That Waited vs Number of Agents

# Customizing the Simulation

• Change total_calls to simulate more or fewer calls.

• Modify min_call_time, max_call_time, min_arrival_gap, max_arrival_gap to model different call behaviors.

• Update agents_list to test additional staffing scenarios.

# Notes

• Random call arrivals and durations may produce slightly different results each run.

• Set random.seed() for reproducible simulations.


