/*
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

package io.swagger.client.api;

import io.swagger.client.model.Files;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ContentApi
 */
@Ignore
public class ContentApiTest {

    private final ContentApi api = new ContentApi();

    /**
     * Download archive
     *
     * This method returns archive by given format.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getArchiveTest() throws Exception {
        String owner = null;
        String repo = null;
        String ref = null;
        String format = null;
        api.getArchive(owner, repo, ref, format);

        // TODO: test validations
    }
    /**
     * List data in a repository folder
     *
     * List files, commit sha1, and versioning type for a folder in repository.  To get sizes add to the query param &#x60;include_size&#x3D;true&#x60;. May result slower response. 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getContentTest() throws Exception {
        String owner = null;
        String repo = null;
        String branch = null;
        String path = null;
        Boolean includeSize = null;
        Files response = api.getContent(owner, repo, branch, path, includeSize);

        // TODO: test validations
    }
    /**
     * Download raw content
     *
     * This method returns the raw content of a file.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getRawTest() throws Exception {
        String owner = null;
        String repo = null;
        String ref = null;
        String path = null;
        api.getRaw(owner, repo, ref, path);

        // TODO: test validations
    }
    /**
     * Upload data to a repository
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void uploadContentTest() throws Exception {
        String owner = null;
        String repo = null;
        String branch = null;
        String path = null;
        String commitSummary = null;
        String commitMessage = null;
        String commitChoice = null;
        String lastCommit = null;
        String newBranchName = null;
        String versioning = null;
        String files = null;
        api.uploadContent(owner, repo, branch, path, commitSummary, commitMessage, commitChoice, lastCommit, newBranchName, versioning, files);

        // TODO: test validations
    }
}
