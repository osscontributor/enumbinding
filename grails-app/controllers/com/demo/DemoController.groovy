package com.demo

class DemoController {

    def createCompany() {
        def company = new Company(params)
        render "Name: ${company.name}, Status: ${company.companyStatus}"
    }
}
