import com.example.app._
import org.scalatra._
import org.scalatra.metrics.MetricsBootstrap
import org.scalatra.metrics.MetricsSupportExtensions.MetricsSupportExtension

import javax.servlet.ServletContext

class ScalatraBootstrap extends LifeCycle with MetricsBootstrap{

  override def init(context: ServletContext) {
    context.mount(new MyScalatraServlet, "/*")

    context.mountMetricsAdminServlet("/metrics-admin")
    context.mountHealthCheckServlet("/health")
    context.mountMetricsServlet("/metrics")
    context.mountThreadDumpServlet("/thread-dump")
    context.installInstrumentedFilter("/test/*")
  }
}
