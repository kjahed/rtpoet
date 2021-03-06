package ca.jahed.rtpoet.rtmodel.cppproperties

import ca.jahed.rtpoet.rtmodel.builders.cppproperties.RTClassPropertiesBuilder

class RTClassProperties(
    var kind: ClsKind? = null,
    var headerPreface: String? = null,
    var headerEnding: String? = null,
    var implementationPreface: String? = null,
    var implementationEnding: String? = null,
    var publicDeclarations: String? = null,
    var privateDeclarations: String? = null,
    var protectedDeclarations: String? = null,
    var implementationType: String? = null,
    var generate: Boolean = false,
    var generateHeader: Boolean = false,
    var generateImplementation: Boolean = false,
    var generateStateMachine: Boolean = false,
    var generateAssignmentOperator: Boolean = false,
    var generateEqualityOperator: Boolean = false,
    var generateInequalityOperator: Boolean = false,
    var generateInsertionOperator: Boolean = false,
    var generateExtractionOperator: Boolean = false,
    var generateCopyConstructor: Boolean = false,
    var generateDefaultConstructor: Boolean = false,
    var generateDestructor: Boolean = false,
) : RTProperties() {


    enum class ClsKind {
        CLASS, STRUCT, UNION, TYPEDEF
    }

    private class Builder : RTClassPropertiesBuilder {
        private var kind: ClsKind = ClsKind.CLASS

        private var headerPreface: String? = null
        private var headerEnding: String? = null
        private var implementationPreface: String? = null
        private var implementationEnding: String? = null
        private var publicDeclarations: String? = null
        private var privateDeclarations: String? = null
        private var protectedDeclarations: String? = null
        private var implementationType: String? = null


        private var generate = true
        private var generateHeader = true
        private var generateImplementation = true
        private var generateStateMachine = true

        private var generateAssignmentOperator = true
        private var generateEqualityOperator = true
        private var generateInequalityOperator = true
        private var generateInsertionOperator = true
        private var generateExtractionOperator = true

        private var generateCopyConstructor = true
        private var generateDefaultConstructor = true
        private var generateDestructor = true

        override fun struct() = apply { this.kind = ClsKind.STRUCT }
        override fun union() = apply { this.kind = ClsKind.UNION }
        override fun typedef() = apply { this.kind = ClsKind.TYPEDEF }

        override fun headerPreface(headerPreface: String) = apply { this.headerPreface = headerPreface }
        override fun headerEnding(headerEnding: String) = apply { this.headerEnding = headerEnding }
        override fun implementationPreface(implementationPreface: String) =
            apply { this.implementationPreface = implementationPreface }

        override fun implementationEnding(implementationEnding: String) =
            apply { this.implementationEnding = implementationEnding }

        override fun publicDeclarations(publicDeclarations: String) =
            apply { this.publicDeclarations = publicDeclarations }

        override fun privateDeclarations(privateDeclarations: String) =
            apply { this.privateDeclarations = privateDeclarations }

        override fun protectedDeclarations(protectedDeclarations: String) =
            apply { this.protectedDeclarations = protectedDeclarations }

        override fun implementationType(implementationType: String) =
            apply { this.implementationType = implementationType }


        override fun dontGenerate() = apply { this.generate = false }
        override fun dontGenerateHeader() = apply { this.generateHeader = false }
        override fun dontGenerateImplementation() = apply { this.generateImplementation = false }
        override fun dontGenerateStateMachine() = apply { this.generateStateMachine = false }
        override fun dontGenerateAssignmentOperator() = apply { this.generateAssignmentOperator = false }
        override fun dontGenerateEqualityOperator() = apply { this.generateEqualityOperator = false }
        override fun dontGenerateInequalityOperator() = apply { this.generateInequalityOperator = false }
        override fun dontGenerateInsertionOperator() = apply { this.generateInsertionOperator = false }
        override fun dontGenerateExtractionOperator() = apply { this.generateExtractionOperator = false }
        override fun dontGenerateCopyConstructor() = apply { this.generateCopyConstructor = false }
        override fun dontGenerateDefaultConstructor() = apply { this.generateDefaultConstructor = false }
        override fun dontGenerateDestructor() = apply { this.generateDestructor = false }

        override fun build(): RTClassProperties {
            return RTClassProperties(
                kind,
                headerPreface,
                headerEnding,
                implementationPreface,
                implementationEnding,
                publicDeclarations,
                privateDeclarations,
                protectedDeclarations,
                implementationType,
                generate,
                generateHeader,
                generateImplementation,
                generateStateMachine,
                generateAssignmentOperator,
                generateEqualityOperator,
                generateInequalityOperator,
                generateInsertionOperator,
                generateExtractionOperator,
                generateCopyConstructor,
                generateDefaultConstructor,
                generateDestructor)
        }
    }

    companion object {
        @JvmStatic
        fun builder(): RTClassPropertiesBuilder {
            return Builder()
        }
    }
}