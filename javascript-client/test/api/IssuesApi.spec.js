/*
 * DagsHub API
 * This API is used to interact with DagsHub. 
 *
 * OpenAPI spec version: 1.0.0
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
    instance = new DagsHubApi.IssuesApi();
  });

  describe('(package)', function() {
    describe('IssuesApi', function() {
      describe('createIssue', function() {
        it('should call createIssue successfully', function(done) {
          // TODO: uncomment, update parameter values for createIssue call and complete the assertions
          /*
          var opts = {};

          instance.createIssue(owner, repo, opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(DagsHubApi.Issue);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('editIssue', function() {
        it('should call editIssue successfully', function(done) {
          // TODO: uncomment, update parameter values for editIssue call and complete the assertions
          /*
          var opts = {};

          instance.editIssue(owner, repo, opts, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(DagsHubApi.Issue);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('getIssue', function() {
        it('should call getIssue successfully', function(done) {
          // TODO: uncomment, update parameter values for getIssue call and complete the assertions
          /*

          instance.getIssue(owner, repo, index, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(DagsHubApi.Issue);

            done();
          });
          */
          // TODO: uncomment and complete method invocation above, then delete this line and the next:
          done();
        });
      });
      describe('listRepoIssues', function() {
        it('should call listRepoIssues successfully', function(done) {
          // TODO: uncomment, update parameter values for listRepoIssues call and complete the assertions
          /*

          instance.listRepoIssues(owner, repo, function(error, data, response) {
            if (error) {
              done(error);
              return;
            }
            // TODO: update response assertions
            expect(data).to.be.a(DagsHubApi.Issues);

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
