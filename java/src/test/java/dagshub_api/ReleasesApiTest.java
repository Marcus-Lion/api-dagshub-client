/*
 * DagsHub API
 * This API is used to interact with DagsHub. 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package dagshub_api;

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for ReleasesApi
 */
@Ignore
public class ReleasesApiTest {

    private final ReleasesApi api = new ReleasesApi();

    /**
     * List Releases
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void listReleasesTest() throws Exception {
        String owner = null;
        String repo = null;
        api.listReleases(owner, repo);

        // TODO: test validations
    }
}