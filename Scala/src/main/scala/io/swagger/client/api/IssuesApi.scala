/**
 * DagsHub API
 * This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.api

import java.text.SimpleDateFormat

import io.swagger.client.model.Issue
import io.swagger.client.model.Issues
import io.swagger.client.model.PatchIssue
import io.swagger.client.model.PostIssue
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

class IssuesApi(
  val defBasePath: String = "https://dagshub.com/api/v1",
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
  val helper = new IssuesApiAsyncHelper(client, config)

  /**
   * Create an issue
   * Any user with read access to a repository can create an issue.
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @param body  (optional)
   * @return Issue
   */
  def createIssue(owner: String, repo: String, body: Option[PostIssue] = None): Option[Issue] = {
    val await = Try(Await.result(createIssueAsync(owner, repo, body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create an issue asynchronously
   * Any user with read access to a repository can create an issue.
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @param body  (optional)
   * @return Future(Issue)
   */
  def createIssueAsync(owner: String, repo: String, body: Option[PostIssue] = None): Future[Issue] = {
      helper.createIssue(owner, repo, body)
  }

  /**
   * Edit an issue
   * 
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @param body  (optional)
   * @return Issue
   */
  def editIssue(owner: String, repo: String, body: Option[PatchIssue] = None): Option[Issue] = {
    val await = Try(Await.result(editIssueAsync(owner, repo, body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Edit an issue asynchronously
   * 
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @param body  (optional)
   * @return Future(Issue)
   */
  def editIssueAsync(owner: String, repo: String, body: Option[PatchIssue] = None): Future[Issue] = {
      helper.editIssue(owner, repo, body)
  }

  /**
   * Get a single issue
   * This endpoint may also return pull requests in the response. If an issue is a pull request, the object will include a pull_request key.
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @param index the index of an issue or a pull request 
   * @return Issue
   */
  def getIssue(owner: String, repo: String, index: Integer): Option[Issue] = {
    val await = Try(Await.result(getIssueAsync(owner, repo, index), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Get a single issue asynchronously
   * This endpoint may also return pull requests in the response. If an issue is a pull request, the object will include a pull_request key.
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @param index the index of an issue or a pull request 
   * @return Future(Issue)
   */
  def getIssueAsync(owner: String, repo: String, index: Integer): Future[Issue] = {
      helper.getIssue(owner, repo, index)
  }

  /**
   * List issues for a repository
   * This endpoint may also return pull requests in the response. If an issue is a pull request, the object will include a pull_request key.
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @return Issues
   */
  def listRepoIssues(owner: String, repo: String): Option[Issues] = {
    val await = Try(Await.result(listRepoIssuesAsync(owner, repo), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List issues for a repository asynchronously
   * This endpoint may also return pull requests in the response. If an issue is a pull request, the object will include a pull_request key.
   *
   * @param owner owner of the repository 
   * @param repo name of the repository 
   * @return Future(Issues)
   */
  def listRepoIssuesAsync(owner: String, repo: String): Future[Issues] = {
      helper.listRepoIssues(owner, repo)
  }

}

class IssuesApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createIssue(owner: String,
    repo: String,
    body: Option[PostIssue] = None
    )(implicit reader: ClientResponseReader[Issue], writer: RequestWriter[Option[PostIssue]]): Future[Issue] = {
    // create path and map variables
    val path = (addFmt("/repos/{owner}/{repo}/issues")
      replaceAll("\\{" + "owner" + "\\}", owner.toString)
      replaceAll("\\{" + "repo" + "\\}", repo.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (owner == null) throw new Exception("Missing required parameter 'owner' when calling IssuesApi->createIssue")

    if (repo == null) throw new Exception("Missing required parameter 'repo' when calling IssuesApi->createIssue")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def editIssue(owner: String,
    repo: String,
    body: Option[PatchIssue] = None
    )(implicit reader: ClientResponseReader[Issue], writer: RequestWriter[Option[PatchIssue]]): Future[Issue] = {
    // create path and map variables
    val path = (addFmt("/repos/{owner}/{repo}/issues")
      replaceAll("\\{" + "owner" + "\\}", owner.toString)
      replaceAll("\\{" + "repo" + "\\}", repo.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (owner == null) throw new Exception("Missing required parameter 'owner' when calling IssuesApi->editIssue")

    if (repo == null) throw new Exception("Missing required parameter 'repo' when calling IssuesApi->editIssue")


    val resFuture = client.submit("PATCH", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getIssue(owner: String,
    repo: String,
    index: Integer)(implicit reader: ClientResponseReader[Issue]): Future[Issue] = {
    // create path and map variables
    val path = (addFmt("/repos/{owner}/{repo}/issues/{index}")
      replaceAll("\\{" + "owner" + "\\}", owner.toString)
      replaceAll("\\{" + "repo" + "\\}", repo.toString)
      replaceAll("\\{" + "index" + "\\}", index.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (owner == null) throw new Exception("Missing required parameter 'owner' when calling IssuesApi->getIssue")

    if (repo == null) throw new Exception("Missing required parameter 'repo' when calling IssuesApi->getIssue")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def listRepoIssues(owner: String,
    repo: String)(implicit reader: ClientResponseReader[Issues]): Future[Issues] = {
    // create path and map variables
    val path = (addFmt("/repos/{owner}/{repo}/issues")
      replaceAll("\\{" + "owner" + "\\}", owner.toString)
      replaceAll("\\{" + "repo" + "\\}", repo.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (owner == null) throw new Exception("Missing required parameter 'owner' when calling IssuesApi->listRepoIssues")

    if (repo == null) throw new Exception("Missing required parameter 'repo' when calling IssuesApi->listRepoIssues")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
