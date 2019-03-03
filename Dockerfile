FROM centos
RUN yum install -y java-1.8.0-openjdk
RUN yum install -y java-1.8.0-openjdk-devel
ENV JAVA_HOME /etc/alternatives/jre
RUN mkdir /home/myapp
WORKDIR /home/myapp
ADD /src .
RUN javac Main.java && \
    jar -cvf Main.jar Main.class
CMD ["java", "-cp", "Main.jar", "Main"]