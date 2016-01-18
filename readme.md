### CoreComponent Citygis project [groep-4]
===

    - ScheduledTasks fetches every 15 min for data
    - Logs every request for data
    - Does this on and on till no new entries are available.


### Notes
===

    private static final String root = "http://149.210.236.249:8000/?format=json";
    private static final String events = "http://149.210.236.249:8000/events?format=json";
    private static final String positions = "http://149.210.236.249:8000/positions?format=json";
    private static final String connections = "http://149.210.236.249:8000/connections?format=json";
    private static final String monitors = "http://149.210.236.249:8000/monitors?format=json";