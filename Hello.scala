package ks

import org.apache.kafka.streams.kstream._
import org.apache.kafka.common.serialization.Serdes

/**
 * This is basically the hello world for kafka-streams
 */
object Hello {
	// this tells you how to serialize/deserialize things
	val stringSerde = Serdes.String()

	// builder patterns ftw
	val kStreamBuilder = new KStreamBuilder()
	val simpleFirstStream: KStream[String, String] = kStreamBuilder.stream(stringSerde, stringSerde, "src-topic")

	// sink node
	// lets make everything upper case
	val upperStream = simpleFirstStream.mapValues(_.toUpperCase())
	upperStream.to(stringSerde, stringSerde, "out-topic")
}