/*
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 1.0.1
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
    describe('IssueMilestone', function() {
      beforeEach(function() {
        instance = new DagsHubApi.IssueMilestone();
      });

      it('should create an instance of IssueMilestone', function() {
        // TODO: update the code to test IssueMilestone
        expect(instance).to.be.a(DagsHubApi.IssueMilestone);
      });

      it('should have the property id (base name: "id")', function() {
        // TODO: update the code to test the property id
        expect(instance).to.have.property('id');
        // expect(instance.id).to.be(expectedValueLiteral);
      });

      it('should have the property title (base name: "title")', function() {
        // TODO: update the code to test the property title
        expect(instance).to.have.property('title');
        // expect(instance.title).to.be(expectedValueLiteral);
      });

      it('should have the property description (base name: "description")', function() {
        // TODO: update the code to test the property description
        expect(instance).to.have.property('description');
        // expect(instance.description).to.be(expectedValueLiteral);
      });

      it('should have the property state (base name: "state")', function() {
        // TODO: update the code to test the property state
        expect(instance).to.have.property('state');
        // expect(instance.state).to.be(expectedValueLiteral);
      });

      it('should have the property openIssues (base name: "open_issues")', function() {
        // TODO: update the code to test the property openIssues
        expect(instance).to.have.property('openIssues');
        // expect(instance.openIssues).to.be(expectedValueLiteral);
      });

      it('should have the property closedIssues (base name: "closed_issues")', function() {
        // TODO: update the code to test the property closedIssues
        expect(instance).to.have.property('closedIssues');
        // expect(instance.closedIssues).to.be(expectedValueLiteral);
      });

      it('should have the property closedAt (base name: "closed_at")', function() {
        // TODO: update the code to test the property closedAt
        expect(instance).to.have.property('closedAt');
        // expect(instance.closedAt).to.be(expectedValueLiteral);
      });

      it('should have the property dueOn (base name: "due_on")', function() {
        // TODO: update the code to test the property dueOn
        expect(instance).to.have.property('dueOn');
        // expect(instance.dueOn).to.be(expectedValueLiteral);
      });

    });
  });

}));
