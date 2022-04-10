FROM centos:7
MAINTAINER Ruben Leerentveld
 
RUN yum makecache
RUN yum upgrade -y
RUN yum install -y httpd
