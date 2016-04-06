package com.frontier45.sparktemplate

/**
  * Created by du on 4/6/16.
  */
object OptParser {
  private val parser = new scopt.OptionParser[RunArgs](appName) {
    opt[String]('f', "fname").required().valueName("PATH")
      .text("Input File Name")
      .action((x, c) => c.copy(fname = x))

    opt[String]('o', "output").valueName("PATH")
      .text("Output File Name")
      .action((x, c) => c.copy(out = x))

    opt[String]("spark-master").valueName("URL")
      .text("Spark Master URL")
      .action((x, c) => c.copy(spark_master = Some(x)))
    opt[Int]("num-partitions").valueName("Partitions")
      .text("Number of Partitions")
      .action((x, c) => c.copy(n_partitions = x))
  }

  def parse(args: Array[String]) = parser.parse(args, RunArgs())

}
