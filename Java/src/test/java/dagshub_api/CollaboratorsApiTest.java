/*
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

package dagshub_api;

import io.swagger.client.model.CollaboratorsCollaboratorBody;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * API tests for CollaboratorsApi
 */
@Ignore
public class CollaboratorsApiTest {

    private final CollaboratorsApi api = new CollaboratorsApi();

    /**
     * Add user as a collaborator
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void addCollaboratorTest() throws Exception {
        String username = null;
        String repo = null;
        String collaborator = null;
        CollaboratorsCollaboratorBody body = null;
        api.addCollaborator(username, repo, collaborator, body);

        // TODO: test validations
    }
    /**
     * Get collaborators
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getCollaboratorsTest() throws Exception {
        String username = null;
        String repo = null;
        api.getCollaborators(username, repo);

        // TODO: test validations
    }
    /**
     * Delete collaborator
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void removeCollaboratorTest() throws Exception {
        api.removeCollaborator();

        // TODO: test validations
    }
}
