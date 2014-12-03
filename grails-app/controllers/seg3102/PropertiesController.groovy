package seg3102

class PropertiesController {

    def OwnerService
    def PropertyService

    def index() {}

    def show() {
        def myProperties = ownerService.ownerViewProperties((String)session.user.userName)
        println(myProperties)
        render view:"show", model: [myProperties:myProperties]
    }

    def create() {

        Map addressMap = [:];
        Map propertyMap = [:];

        addressMap.streetName = params.streetName
        addressMap.streetNumber = params.streetNumber
        addressMap.aptNumber = params.aptNumber
        addressMap.city = params.city
        addressMap.postalCode = params.postalCode
        addressMap.province = params.province
        addressMap.country = params.country

        propertyMap.type = params.type
        propertyMap.numBedrooms = params.numBedrooms
        propertyMap.numBathrooms = params.numBathrooms
        propertyMap.numOtherRooms = params.numOtherRooms
        propertyMap.rent = params.rent
        propertyMap.deleteStatus = false

        propertyService.addProperty(propertyMap,addressMap,session.user.userName)

        flash.message = "Property Successfully Created"

        redirect(controller:"properties", action:"show")
    }

    def update() {
        def propertyId = params.propertyId
        Map addressMap = [:];
        Map propertyMap = [:];

        addressMap.streetName = params.streetName
        addressMap.streetNumber = params.streetNumber
        addressMap.aptNumber = params.aptNumber
        addressMap.city = params.city
        addressMap.postalCode = params.postalCode
        addressMap.province = params.province
        addressMap.country = params.country

        propertyMap.type = params.type
        propertyMap.numBedrooms = params.numBedrooms
        propertyMap.numBathrooms = params.numBathrooms
        propertyMap.numOtherRooms = params.numOtherRooms
        propertyMap.rent = params.rent
        propertyMap.deleteStatus = false
        propertyMap.propertyId = propertyId

        propertyService.updateProperty(propertyMap,addressMap,session.user.userName)

        redirect(controller:"properties", action:"show")
    }

    def destroy() {
        def propertyId = params.propertyId
        propertyService.deleteProperty(propertyId)
        redirect(controller:"properties", action:"show")
    }
}
