# kafka-streams

A simple project using kafka-streams in scala with notes etc.


## Interesting random thing I found

Kafka uses Zookeeper for the following:

- Electing a controller. The controller is one of the brokers and is responsible for maintaining the leader/follower relationship for all the partitions. When a node shuts down, it is the controller that tells other replicas to become partition leaders to replace the partition leaders on the node that is going away. Zookeeper is used to elect a controller, make sure there is only one and elect a new one it if it crashes.
- Cluster membership - which brokers are alive and part of the cluster? this is also managed through ZooKeeper.
Topic configuration - which topics exist, how many partitions each has, where are the replicas, who is the preferred leader, what configuration overrides are set for each topic
- (0.9.0) - Quotas - how much data is each client allowed to read and write
- (0.9.0) - ACLs - who is allowed to read and write to which topic
- (old high level consumer) - Which consumer groups exist, who are their members and what is the latest offset each group got from each partition.

I think that covers it :)

The last use-case is the only one that is going away.