/*
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 0.1.0
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.35
 *
 * Do not edit the class manually.
 *
 */
(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.DagsHubApi);
  }
}(this, function(expect, DagsHubApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new DagsHubApi.CollaboratorsApi();
  });

  describe('(package)', function() {
    describe('CollaboratorsApi', function() {
      describe('addCollaborator', function() {
        it('should call addCollaborator successfully', function(done) {
          // TODO: uncomment, update parameter values for addCollaborator call
          /*
          var opts = {};

          instance.addCollaborator(username, repo, collaborator, opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getCollaborators', function() {
        it('should call getCollaborators successfully', function(done) {
          // TODO: uncomment, update parameter values for getCollaborators call
          /*

          instance.getCollaborators(username, repo, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('removeCollaborator', function() {
        it('should call removeCollaborator successfully', function(done) {
          // TODO: uncomment removeCollaborator call
          /*

          instance.removeCollaborator(function(error, data, response) {
            if (error) {
              done(error);
              return;
            }

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
    });
  });

}));
