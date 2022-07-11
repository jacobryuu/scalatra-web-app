package com.example.app

import org.json4s.{DefaultFormats, Formats}
import org.scalatra._
import org.scalatra.json._
import org.scalatra.metrics.MetricsSupport

class MyScalatraServlet extends ScalatraServlet with JacksonJsonSupport with MetricsSupport{

  protected implicit val jsonFormats: Formats = DefaultFormats

  before() {
    contentType = formats("json")
  }

  get("/") {
    FlowerData.all
  }
}

