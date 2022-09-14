/**
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package dagshub_api

import java.text.SimpleDateFormat

import io.swagger.client.model.CreateRepo
import io.swagger.client.model.MigrateRepo
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

class RepositoryApi(
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
  val helper = new RepositoryApiAsyncHelper(client, config)

  /**
   * Create in organization
   * Create a new repository in this organization. The authenticated user must be an **owner** of the specified organization.
   *
   * @param orgname A DagsHub organization name 
   * @param body  (optional)
   * @return void
   */
  def createOrgRepo(orgname: String, body: Option[CreateRepo] = None) = {
    val await = Try(Await.result(createOrgRepoAsync(orgname, body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create in organization asynchronously
   * Create a new repository in this organization. The authenticated user must be an **owner** of the specified organization.
   *
   * @param orgname A DagsHub organization name 
   * @param body  (optional)
   * @return Future(void)
   */
  def createOrgRepoAsync(orgname: String, body: Option[CreateRepo] = None) = {
      helper.createOrgRepo(orgname, body)
  }

  /**
   * Create
   * Create a new repository for the authenticated user.
   *
   * @param body  (optional)
   * @return void
   */
  def createRepo(body: Option[CreateRepo] = None) = {
    val await = Try(Await.result(createRepoAsync(body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Create asynchronously
   * Create a new repository for the authenticated user.
   *
   * @param body  (optional)
   * @return Future(void)
   */
  def createRepoAsync(body: Option[CreateRepo] = None) = {
      helper.createRepo(body)
  }

  /**
   * List your repositories
   * List repositories that are accessible to the authenticated user.  This includes repositories owned by the authenticated user, repositories where the authenticated user is a collaborator, and repositories that the authenticated user has access to through an organization membership. 
   *
   * @return void
   */
  def listMyRepos() = {
    val await = Try(Await.result(listMyReposAsync(), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List your repositories asynchronously
   * List repositories that are accessible to the authenticated user.  This includes repositories owned by the authenticated user, repositories where the authenticated user is a collaborator, and repositories that the authenticated user has access to through an organization membership. 
   *
   * @return Future(void)
   */
  def listMyReposAsync() = {
      helper.listMyRepos()
  }

  /**
   * List organization repositories
   * List repositories that are accessible to the authenticated user.
   *
   * @param orgname A DagsHub organization name 
   * @return void
   */
  def listOrgRepos(orgname: String) = {
    val await = Try(Await.result(listOrgReposAsync(orgname), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List organization repositories asynchronously
   * List repositories that are accessible to the authenticated user.
   *
   * @param orgname A DagsHub organization name 
   * @return Future(void)
   */
  def listOrgReposAsync(orgname: String) = {
      helper.listOrgRepos(orgname)
  }

  /**
   * List user repositories
   * List public repositories for the specified user.
   *
   * @param username A DagsHub username 
   * @return void
   */
  def listUserRepos(username: String) = {
    val await = Try(Await.result(listUserReposAsync(username), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * List user repositories asynchronously
   * List public repositories for the specified user.
   *
   * @param username A DagsHub username 
   * @return Future(void)
   */
  def listUserReposAsync(username: String) = {
      helper.listUserRepos(username)
  }

  /**
   * Migrate repository
   * Migrate a repository from other Git hosting sources for the authenticated user.  To migrate a repository for a organization, the authenticated user must be a **owner** of the specified organization. 
   *
   * @param body  (optional)
   * @return void
   */
  def migrateRepo(body: Option[MigrateRepo] = None) = {
    val await = Try(Await.result(migrateRepoAsync(body), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Migrate repository asynchronously
   * Migrate a repository from other Git hosting sources for the authenticated user.  To migrate a repository for a organization, the authenticated user must be a **owner** of the specified organization. 
   *
   * @param body  (optional)
   * @return Future(void)
   */
  def migrateRepoAsync(body: Option[MigrateRepo] = None) = {
      helper.migrateRepo(body)
  }

  /**
   * Search repositories
   * 
   *
   * @param q  
   * @param uid User ID to specify search whose repositories. Default is 0 and search all repositories (optional, default to 0)
   * @param limit Maximum number of repositories in search results. (optional, default to 10)
   * @param page Page number. Default is 1. (optional, default to 1)
   * @return void
   */
  def search(q: String, uid: Option[Integer] = Option(0), limit: Option[Integer] = Option(10), page: Option[Integer] = Option(1)) = {
    val await = Try(Await.result(searchAsync(q, uid, limit, page), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Search repositories asynchronously
   * 
   *
   * @param q  
   * @param uid User ID to specify search whose repositories. Default is 0 and search all repositories (optional, default to 0)
   * @param limit Maximum number of repositories in search results. (optional, default to 10)
   * @param page Page number. Default is 1. (optional, default to 1)
   * @return Future(void)
   */
  def searchAsync(q: String, uid: Option[Integer] = Option(0), limit: Option[Integer] = Option(10), page: Option[Integer] = Option(1)) = {
      helper.search(q, uid, limit, page)
  }

}

class RepositoryApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def createOrgRepo(orgname: String,
    body: Option[CreateRepo] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Option[CreateRepo]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/org/{orgname}/repos")
      replaceAll("\\{" + "orgname" + "\\}", orgname.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (orgname == null) throw new Exception("Missing required parameter 'orgname' when calling RepositoryApi->createOrgRepo")


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def createRepo(body: Option[CreateRepo] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Option[CreateRepo]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/user/repos"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def listMyRepos()(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/user/repos"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def listOrgRepos(orgname: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/orgs/{orgname}/repos")
      replaceAll("\\{" + "orgname" + "\\}", orgname.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (orgname == null) throw new Exception("Missing required parameter 'orgname' when calling RepositoryApi->listOrgRepos")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def listUserRepos(username: String)(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/users/{username}/repos")
      replaceAll("\\{" + "username" + "\\}", username.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (username == null) throw new Exception("Missing required parameter 'username' when calling RepositoryApi->listUserRepos")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def migrateRepo(body: Option[MigrateRepo] = None
    )(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[Option[MigrateRepo]]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/repos/migrate"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]


    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(body))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def search(q: String,
    uid: Option[Integer] = Option(0),
    limit: Option[Integer] = Option(10),
    page: Option[Integer] = Option(1)
    )(implicit reader: ClientResponseReader[Unit]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/repos/search"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (q == null) throw new Exception("Missing required parameter 'q' when calling RepositoryApi->search")

    queryParams += "q" -> q.toString
    uid match {
      case Some(param) => queryParams += "uid" -> param.toString
      case _ => queryParams
    }
    limit match {
      case Some(param) => queryParams += "limit" -> param.toString
      case _ => queryParams
    }
    page match {
      case Some(param) => queryParams += "page" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}