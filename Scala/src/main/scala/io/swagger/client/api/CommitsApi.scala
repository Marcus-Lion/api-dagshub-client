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

class CommitsApi(
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
  val helper = new CommitsApiAsyncHelper(client, config)

  /**
   * Get a single commit
   * 
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @param sha a SHA1 of a commit 
   * @return void
   */
  def getCommit(owner: String, repo: String, sha: String) = {
    val await = Try(Await.result(getCommitAsync(owner, repo, sha), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a single commit asynchronously
   * 
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @param sha a SHA1 of a commit 
   * @return Future(void)
   */
  def getCommitAsync(owner: String, repo: String, sha: String) = {
      helper.getCommit(owner, repo, sha)
  }

  /**
   * Get the SHA-1 of a commit reference
   * 
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @param ref The name of the commit/branch/tag 
   * @return String
   */
  def getCommitSha1(owner: String, repo: String, ref: String): Option[String] = {
    val await = Try(Await.result(getCommitSha1Async(owner, repo, ref), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get the SHA-1 of a commit reference asynchronously
   * 
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @param ref The name of the commit/branch/tag 
   * @return Future(String)
   */
  def getCommitSha1Async(owner: String, repo: String, ref: String): Future[String] = {
      helper.getCommitSha1(owner, repo, ref)
  }

}

class CommitsApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def getCommit(owner: String,
    repo: String,
    sha: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/repos/{owner}/{repo}/commits/{sha}")
      replaceAll("\\{" + "owner" + "\\}", owner.toString)
      replaceAll("\\{" + "repo" + "\\}", repo.toString)
      replaceAll("\\{" + "sha" + "\\}", sha.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (owner == null) throw new Exception("Missing required parameter 'owner' when calling CommitsApi->getCommit")

    if (repo == null) throw new Exception("Missing required parameter 'repo' when calling CommitsApi->getCommit")

    if (sha == null) throw new Exception("Missing required parameter 'sha' when calling CommitsApi->getCommit")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getCommitSha1(owner: String,
    repo: String,
    ref: String)(implicit reader: ClientResponseReader[String]): Future[String] = {
    // create path and map variables
    val path = (addFmt("/repos/{owner}/{repo}/commits/{ref}")
      replaceAll("\\{" + "owner" + "\\}", owner.toString)
      replaceAll("\\{" + "repo" + "\\}", repo.toString)
      replaceAll("\\{" + "ref" + "\\}", ref.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (owner == null) throw new Exception("Missing required parameter 'owner' when calling CommitsApi->getCommitSha1")

    if (repo == null) throw new Exception("Missing required parameter 'repo' when calling CommitsApi->getCommitSha1")

    if (ref == null) throw new Exception("Missing required parameter 'ref' when calling CommitsApi->getCommitSha1")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
