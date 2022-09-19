/**
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.{ApiInvoker, ApiException}

import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart

import javax.ws.rs.core.MediaType

import java.io.File
import java.util.Date
import java.util.TimeZone

import scala.collection.mutable.HashMap

import com.wordnik.swagger.client._
import scala.concurrent.Future
import collection.mutable

import java.net.URI

import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.util.{Failure, Success, Try}

import org.json4s._

class ContentApi(
  val defBasePath: String = "http://dagshub.com/api/v1/",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new ContentApiAsyncHelper(client, config)

  /**
   * Download archive
   * This method returns archive by given format.
   *
   * @param username A DagsHub username 
   * @param repo name of the repository 
   * @param ref The name of the commit/branch/tag 
   * @param format The format of archive, either .zip or .tar.gz 
   * @return void
   */
  def getArchive(username: String, repo: String, ref: String, format: String) = {
    val await = Try(Await.result(getArchiveAsync(username, repo, ref, format), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Download archive asynchronously
   * This method returns archive by given format.
   *
   * @param username A DagsHub username 
   * @param repo name of the repository 
   * @param ref The name of the commit/branch/tag 
   * @param format The format of archive, either .zip or .tar.gz 
   * @return Future(void)
   */
  def getArchiveAsync(username: String, repo: String, ref: String, format: String) = {
      helper.getArchive(username, repo, ref, format)
  }

  /**
   * Download raw content
   * This method returns the raw content of a file.
   *
   * @param username A DagsHub username 
   * @param repo name of the repository 
   * @param ref The name of the commit/branch/tag 
   * @param &#x60;path&#x60; The content path 
   * @return void
   */
  def getRaw(username: String, repo: String, ref: String, &#x60;path&#x60;: String) = {
    val await = Try(Await.result(getRawAsync(username, repo, ref, &#x60;path&#x60;), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Download raw content asynchronously
   * This method returns the raw content of a file.
   *
   * @param username A DagsHub username 
   * @param repo name of the repository 
   * @param ref The name of the commit/branch/tag 
   * @param &#x60;path&#x60; The content path 
   * @return Future(void)
   */
  def getRawAsync(username: String, repo: String, ref: String, &#x60;path&#x60;: String) = {
      helper.getRaw(username, repo, ref, &#x60;path&#x60;)
  }

}

class ContentApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def getArchive(username: String,
    repo: String,
    ref: String,
    format: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/repos/{username}/{repo}/archive/{ref}/{format}")
      replaceAll("\\{" + "username" + "\\}", username.toString)
      replaceAll("\\{" + "repo" + "\\}", repo.toString)
      replaceAll("\\{" + "ref" + "\\}", ref.toString)
      replaceAll("\\{" + "format" + "\\}", format.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (username == null) throw new Exception("Missing required parameter 'username' when calling ContentApi->getArchive")

    if (repo == null) throw new Exception("Missing required parameter 'repo' when calling ContentApi->getArchive")

    if (ref == null) throw new Exception("Missing required parameter 'ref' when calling ContentApi->getArchive")

    if (format == null) throw new Exception("Missing required parameter 'format' when calling ContentApi->getArchive")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getRaw(username: String,
    repo: String,
    ref: String,
    &#x60;path&#x60;: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/repos/{username}/{repo}/raw/{ref}/{path}")
      replaceAll("\\{" + "username" + "\\}", username.toString)
      replaceAll("\\{" + "repo" + "\\}", repo.toString)
      replaceAll("\\{" + "ref" + "\\}", ref.toString)
      replaceAll("\\{" + "path" + "\\}", &#x60;path&#x60;.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (username == null) throw new Exception("Missing required parameter 'username' when calling ContentApi->getRaw")

    if (repo == null) throw new Exception("Missing required parameter 'repo' when calling ContentApi->getRaw")

    if (ref == null) throw new Exception("Missing required parameter 'ref' when calling ContentApi->getRaw")

    if (&#x60;path&#x60; == null) throw new Exception("Missing required parameter '&#x60;path&#x60;' when calling ContentApi->getRaw")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
