# What is Resolute
Resolute is a highly scalable enterprise solution to running your Gatling tests.

## What is the resolute-hub?

The resolute hub is the entrypoint to the resolute app. It accepts run requests from an end-user or pipeline and queues them in rabbitmq
The resolute nodes then pick up these messages and run the gatling test.

## What do I need to run resolute-hub?
Just docker, docker-compose and rest client. The whole thing will be setup for you.
If you already have some of these services like rabbitmq provided by your enterprise,
you can remove them from the compose file and use environment variables to override the values in the app.

## How do I deploy resolute-hub
just run the [docker-compose.yml](docker-compose.yml) file on your command line. The hub will be up and running.

## Documentation.

I have swagger documentation enabled with documentation built in. Deploy this app on your localhost and navigate to
[localhost:8080/swagger-ui.html#/](http://localhost:8080/swagger-ui.html#/)
