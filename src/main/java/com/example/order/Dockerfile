FROM docker-prod.artifactory.aws.athenahealth.com/app-fabric/java:11

EXPOSE 8080

ADD /target/order.jar order.jar
COPY docker-entrypoint.sh docker-entrypoint.sh
RUN chmod +x ./docker-entrypoint.sh

ENTRYPOINT ["/bin/sh", "./docker-entrypoint.sh"]
