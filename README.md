# IndoorLTE3a
Android app used to record and grade indoor LTE coverage. Below is a sequential flow of screenshots from an actual walk test. Our research paper describing the statistcal algorithm used for scoring and what the range of scores mean is currently in the process of being published. 

Currently, the app lists and collects LTE data (RSRP, RSRQ, PCI, and timestamps) at a rate of twice per second and displays the values to the UI, as well as, records all the data into a CSV file stored externally on the device’s memory, then the app plots the data on a line graph or pie chart that is touch sensitive and can be scrolled, pinch-zoom, etc. Finally, the app does some basic statistics on the RSRP data and outputs a grade for that specific collection of data which is updated to the UI.

![alt text][flow]

[flow]: https://github.com/parksjg/IndoorLTE3a/blob/master/indoorLTEpictures/Screen%20Shot%202017-01-03%20at%202.12.31%20PM.png "Flow chart"

Thanks to A. C. for help with the UI/UX! 

