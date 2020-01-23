package org.example

import org.apache.spark.{SparkContext, SparkConf}

/**
 * @author ${user.name}
 */
object App {

  def main(args : Array[String]): Unit = {
    val conf = new SparkConf().setAppName("mySpark")
    conf.setMaster("local")

    val sc = new SparkContext(conf)
    val rdd = sc.parallelize(List(1,2,3,4,5,6)).map(_*3)
    val mappedRdd = rdd.filter(_>10).collect()
    println(rdd.reduce(_+_))
    for(x<-mappedRdd) {
      print(x+ " ")
    }
    println()
    println("test done")
  }

}
