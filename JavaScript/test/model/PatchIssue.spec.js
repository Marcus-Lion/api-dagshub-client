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

  describe('(package)', function() {
    describe('PatchIssue', function() {
      beforeEach(function() {
        instance = new DagsHubApi.PatchIssue();
      });

      it('should create an instance of PatchIssue', function() {
        // TODO: update the code to test PatchIssue
        expect(instance).to.be.a(DagsHubApi.PatchIssue);
      });

      it('should have the property title (base name: "title")', function() {
        // TODO: update the code to test the property title
        expect(instance).to.have.property('title');
        // expect(instance.title).to.be(expectedValueLiteral);
      });

      it('should have the property body (base name: "body")', function() {
        // TODO: update the code to test the property body
        expect(instance).to.have.property('body');
        // expect(instance.body).to.be(expectedValueLiteral);
      });

      it('should have the property assignee (base name: "assignee")', function() {
        // TODO: update the code to test the property assignee
        expect(instance).to.have.property('assignee');
        // expect(instance.assignee).to.be(expectedValueLiteral);
      });

      it('should have the property milestone (base name: "milestone")', function() {
        // TODO: update the code to test the property milestone
        expect(instance).to.have.property('milestone');
        // expect(instance.milestone).to.be(expectedValueLiteral);
      });

      it('should have the property state (base name: "state")', function() {
        // TODO: update the code to test the property state
        expect(instance).to.have.property('state');
        // expect(instance.state).to.be(expectedValueLiteral);
      });

    });
  });

}));
