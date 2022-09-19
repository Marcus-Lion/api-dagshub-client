/* tslint:disable */
/* eslint-disable */
/**
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
/**
 * 
 * @export
 * @interface CreateRepo
 */
export interface CreateRepo {
    /**
     * name of the repository
     * @type {string}
     * @memberof CreateRepo
     */
    name: string;
    /**
     * A short description of the repository
     * @type {string}
     * @memberof CreateRepo
     */
    description?: string;
    /**
     * Either true to create a private repository, or false to create a public one.
     * @type {boolean}
     * @memberof CreateRepo
     */
    _private?: boolean;
    /**
     * Pass true to create an initial commit with README, .gitignore and LICENSE.
     * @type {boolean}
     * @memberof CreateRepo
     */
    autoInit?: boolean;
    /**
     * Desired language .gitignore templates to apply. Use the name of the templates.
     * @type {string}
     * @memberof CreateRepo
     */
    gitignores?: string;
    /**
     * Desired LICENSE template to apply. Use the name of the template.
     * @type {string}
     * @memberof CreateRepo
     */
    license?: CreateRepoLicenseEnum;
    /**
     * Desired README template to apply. Use the name of the template.
     * @type {string}
     * @memberof CreateRepo
     */
    readme?: string;
}

/**
    * @export
    * @enum {string}
    */
export enum CreateRepoLicenseEnum {
    ApacheLicense20 = 'Apache License 2.0',
    MITLicense = 'MIT License',
    AbstylesLicense = 'Abstyles License',
    AcademicFreeLicenseV11 = 'Academic Free License v1.1',
    AcademicFreeLicenseV12 = 'Academic Free License v1.2',
    AcademicFreeLicenseV20 = 'Academic Free License v2.0',
    AcademicFreeLicenseV21 = 'Academic Free License v2.1',
    AcademicFreeLicenseV30 = 'Academic Free License v3.0',
    AfferoGeneralPublicLicenseV10 = 'Affero General Public License v1.0',
    ApacheLicense10 = 'Apache License 1.0',
    ApacheLicense11 = 'Apache License 1.1',
    ArtisticLicense10 = 'Artistic License 1.0',
    ArtisticLicense20 = 'Artistic License 2.0',
    BSD2ClauseLicense = 'BSD 2-clause License',
    BSD3ClauseLicense = 'BSD 3-clause License',
    BSD4ClauseLicense = 'BSD 4-clause License',
    CreativeCommonsCC010Universal = 'Creative Commons CC0 1.0 Universal',
    EclipsePublicLicense10 = 'Eclipse Public License 1.0',
    EducationalCommunityLicenseV10 = 'Educational Community License v1.0',
    EducationalCommunityLicenseV20 = 'Educational Community License v2.0',
    GNUAfferoGeneralPublicLicenseV30 = 'GNU Affero General Public License v3.0',
    GNUFreeDocumentationLicenseV11 = 'GNU Free Documentation License v1.1',
    GNUFreeDocumentationLicenseV12 = 'GNU Free Documentation License v1.2',
    GNUFreeDocumentationLicenseV13 = 'GNU Free Documentation License v1.3',
    GNUGeneralPublicLicenseV10 = 'GNU General Public License v1.0',
    GNUGeneralPublicLicenseV20 = 'GNU General Public License v2.0',
    GNUGeneralPublicLicenseV30 = 'GNU General Public License v3.0',
    GNULesserGeneralPublicLicenseV21 = 'GNU Lesser General Public License v2.1',
    GNULesserGeneralPublicLicenseV30 = 'GNU Lesser General Public License v3.0',
    GNULibraryGeneralPublicLicenseV20 = 'GNU Library General Public License v2.0',
    ISCLicense = 'ISC license',
    MozillaPublicLicense10 = 'Mozilla Public License 1.0',
    MozillaPublicLicense11 = 'Mozilla Public License 1.1',
    MozillaPublicLicense203 = 'Mozilla Public License 2.03'
}

