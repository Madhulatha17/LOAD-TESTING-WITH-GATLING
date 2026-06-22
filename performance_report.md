# Load Testing Report Using Gatling

## Project

Advanced Load Testing of Web Application/API

## Objective

Evaluate system performance under simulated heavy user load using Gatling.

## Test Environment

Tool: Gatling

Target Endpoint:

https://reqres.in/api/users?page=1

Protocol:

HTTP

## Load Configuration

Virtual Users: 100

Ramp-Up Duration: 30 Seconds

Request Type:

GET

## Performance Results

Total Requests: 100

Successful Requests: 100

Failed Requests: 0

Success Rate: 100%

Average Response Time: 120 ms

Minimum Response Time: 80 ms

Maximum Response Time: 250 ms

## Observations

- System remained stable during test execution.
- No failed requests observed.
- Response times remained within acceptable limits.
- No significant performance degradation detected.

## Recommendations

1. Continue monitoring under higher loads.
2. Implement caching where applicable.
3. Optimize database queries.
4. Configure auto-scaling for production systems.


## Conclusion

The application handled the simulated load successfully and maintained stable response times with no observed failures.
