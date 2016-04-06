package com.frontier45

/**
  * Created by du on 4/6/16.
  */
package object sparktemplate {
  val appName = "SparkTemplate"

  case class RunArgs(
    fname: String = "",
    out: String = "",
    spark_master: Option[String] = None,
    n_partitions: Int = 1
  )

}
