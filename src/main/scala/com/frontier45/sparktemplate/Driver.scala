package com.frontier45.sparktemplate

/**
  * Created by du on 4/6/16.
  */
object Driver {

  def main(args: Array[String]) {
    OptParser.parse(args)
      .map(Job.start)
      .getOrElse(System.exit(1))
  }
}
