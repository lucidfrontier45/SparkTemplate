package com.frontier45.sparktemplate

/**
  * Created by du on 4/6/16.
  */

import org.apache.spark.{SparkConf, SparkContext}

/**
  * Created by du on 4/5/16.
  */
object Job {

  private def mainTask(args: RunArgs)(implicit sc: SparkContext): Unit = {
    val src = sc.textFile(args.fname, minPartitions = args.n_partitions)
    println(src.count())
  }


  def start(args: RunArgs): Unit = {
    val conf = new SparkConf()
    conf.getOption("spark.app.name").getOrElse(conf.setAppName(appName))
    conf.getOption("spark.master").getOrElse(conf.setMaster("local[*]"))
    implicit val sc = new SparkContext(conf)
    mainTask(args)
    sc.stop()
  }
}
