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
    instance = new DagsHubApi.BranchesApi();
  });

  describe('(package)', function() {
    describe('BranchesApi', function() {
      describe('getBranch', function() {
        it('should call getBranch successfully', function(done) {
          // TODO: uncomment, update parameter values for getBranch call
          /*

          instance.getBranch(owner, repo, branch, function(error, data, response) {
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
      describe('listBranches', function() {
        it('should call listBranches successfully', function(done) {
          // TODO: uncomment, update parameter values for listBranches call
          /*

          instance.listBranches(owner, repo, function(error, data, response) {
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