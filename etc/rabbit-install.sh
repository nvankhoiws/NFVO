#!/bin/bash

sudo apt-get install rabbitmq-server # Install rabbitmq server with in terminal
sudo rabbitmqctl add_user admin openbaton # Add user "admin" with password "openbaton"
sudo rabbitmqctl set_user_tags admin administrator

# Set permission for user "admin" on vhost with ip "/" with full configure (* mean with all name of exchange and queue), full write, full read access respectively
sudo rabbitmqctl set_permissions -p / admin ".*" ".*" ".*"
sudo service rabbitmq-server restart
