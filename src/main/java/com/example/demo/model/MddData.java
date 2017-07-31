package com.example.demo.model;

import java.util.List;

public class MddData {
    private String orderId; //订单id
    private boolean changed;    //是否为验厂成功过后 又更改
    private String drawer_name; //开票人名称
    private int address_conformed;  // 注册地与经营地是否相符：0否，1是
    private int business_license;   //营业执照：0没有，1有
    private int registered_capital; //注册资本（万）
    private int contributed_capital;    //实缴资本（万）
    private String registered_date; //注册日期
    private int tax_certification;  //一般纳税人认证：0没有，1有
    private String tax_certification_date;  //一般纳税人认证时间
    private String tax_level;   //纳税人等级
    private String main_products;   //主营产品
    private String business_place_type; //经营场所性质
    private float business_place_area;  //经营场所面积（平方米）
    private int business_place_term;    //经营场所期限（月）
    private int employees_amount;   //员工人数（人）
    private int production_line_amount; //生产线数量（条）
    private int equipment_amount;   //设备数量（件）
    private int qualification_certificate;  //企业资质证书：0没有，1有
    private String qualification_certificate_type;  //资质证书类型
    private String corporate_identity_card; //法人身份证
    private int corporate_age;  // 从业年龄（岁）
    private String corporate_management_level;  //管理水平
    private String month_production_capacity;   //月均产能
    private String annual_maximum_capacity; //年最大产能
    private int production_cycle;   //生产周期（天）
    private String production_line_status;  //生成线状态
    private String manage_province; //经营地址 省
    private String manage_city; // 经营地址 市
    private String manage_area; //经营地址 区
    private String manage_address;  //经营地址 详细地址
    private String register_province;   //注册地址 省
    private String register_city;   //注册地址 市
    private String register_area;   //注册地址 区
    private String register_address;    //注册地址 详细地址
    private List<MddDataList1> factory_inspection_list; //验厂清单图片列表
    private List<MddDataList1> employee_roster_list; //员工花名册列表
    private List<MddDataList1> company_organize_list; //公司组织架构图列表
    private List<MddDataList1> brochure_list; //产品宣传册列表
    private List<MddDataList1> product_dir_list; //产品目录列表
    private List<MddDataList1> main_products_list; //主营产品图片
    private List<MddDataList1> business_licence_list; //营业执照列表
    private List<MddDataList1> property_documents_list; //房产证文件列表
    private List<MddDataList1> lease_contract_documents_list; //租赁合同文件列表
    private List<MddDataList1> corporate_identity_list; // 法人身份证列表
    private List<MddDataList1> product_certification_list; // 产品认证证书列表
    private List<MddDataList1> system_certification_list; // 体系认证证书列表
    private List<MddDataList1> honor_certificate_list; // 荣誉证书列表
    private List<MddDataList1> buyer_certification_list; // 买家认证证书列表
    private List<MddDataList1> enterprise_patent_certificate_list; // 企业专利证书列表
    private List<MddDataList1> management_guide_list; // 管理手册列表
    private List<MddDataList1> bylaw_list; // 规章制度列表
    private List<MddDataList1> production_flow_list; // 生产流程列表
    private List<MddDataList1> program_file_list; // 程序文件列表
    private List<MddDataList1> work_instruction_list; // 作业指导书列表
    private List<MddDataList1> staff_records_list; // 员工档案列表
    private List<MddDataList1> training_records_list; // 培训记录列表
    private List<MddDataList1> three_months_attendance_records_list; // 近3个月的考勤记录列表
    private List<MddDataList1> three_months_salary_list; // 近3个月的工资表列表
    private List<MddDataList1> one_year_tax_return_list; // 近1年的纳税申报表列表
    private List<MddDataList1> one_year_order_list; // 近1年的订单清单列表
    private List<MddDataList1> three_months_payment_vouchers_list; // 近3个月的房租缴纳凭证列表
    private List<MddDataList1> three_months_electricity_payment_list; // 近3个月的水电缴费凭证列表
    private List<MddDataList1> raw_material_input_invoice_list; // 原料进项发票列表
    private List<MddDataList1> raw_material_warehouse_record_list; // 原料仓库进出货记录列表
    private List<MddDataList1> finished_goods_in_warehouse_list; // 成品仓库进出货记录列表
    private List<MddDataList1> ocean_logistics_list; // 海运提单/物流清单列表
    private List<MddDataList1> production_plan_list; // 生产计划单列表
    private List<MddDataList1> production_statement_list; // 生产报表列表
    private List<MddDataList1> quality_inspection_record_list; // 品质检验记录列表
    private List<MddDataList1> factory_gate_list; // 工厂大门列表
    private List<MddDataList1> factory_main_building_list; // 工厂主体建筑列表
    private List<MddDataList1> office_area_list; // 办公区域列表
    private List<MddDataList1> sample_room_list; // 样品间列表
    private List<MddDataList1> producing_departments_list; // 生产车间列表
    private List<MddDataList1> raw_materials_warehouse_list; // 原料仓库列表
    private List<MddDataList1> finished_goods_warehouse_list; // 成品仓库列表
    private List<MddDataList1> finished_product_room_list; // 成品检验室列表
    private List<MddDataList1> staff_dormitory_building_list; // 员工宿舍楼列表
    private List<MddDataList1> canteen_list; // 食堂列表
    private List<MddDataList1> entertainment_place_list; // 娱乐活动场所列表
    private List<MddDataList1> infirmary_list; // 医务室列表
    private List<MddDataList2> production_equipmentlist_list; // 生产设备清单列表
    private List<MddDataList1> production_equipment_list; // 生产设备列表
    private List<MddDataList1> safety_list; // 安全设备列表
    private List<MddDataList1> insider_list; // 内部人员
    private List<MddDataList1> outsiders_list; // 外部人员
    private String company_base_info;   //公司基本信息
    private int product_department_people;  //生产部人数
    private int administrative_logistics_people;  //行政后勤人数
    private int temporary_people;  //临时工人数
    private int high_intermediate_people;  //中高级职称人员
    private int development_people;  //研发人员人数
    private String hardware;  //硬件（三选一）
    private float domestic_sales_ratio; //产品内销比例
    private float export_proportion_ratio; //产品外销比例
    private String mainly_sold; //主要销往国家和地区

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public boolean isChanged() {
        return changed;
    }

    public void setChanged(boolean changed) {
        this.changed = changed;
    }

    public String getDrawer_name() {
        return drawer_name;
    }

    public void setDrawer_name(String drawer_name) {
        this.drawer_name = drawer_name;
    }

    public int getAddress_conformed() {
        return address_conformed;
    }

    public void setAddress_conformed(int address_conformed) {
        this.address_conformed = address_conformed;
    }

    public int getBusiness_license() {
        return business_license;
    }

    public void setBusiness_license(int business_license) {
        this.business_license = business_license;
    }

    public int getRegistered_capital() {
        return registered_capital;
    }

    public void setRegistered_capital(int registered_capital) {
        this.registered_capital = registered_capital;
    }

    public int getContributed_capital() {
        return contributed_capital;
    }

    public void setContributed_capital(int contributed_capital) {
        this.contributed_capital = contributed_capital;
    }

    public String getRegistered_date() {
        return registered_date;
    }

    public void setRegistered_date(String registered_date) {
        this.registered_date = registered_date;
    }

    public int getTax_certification() {
        return tax_certification;
    }

    public void setTax_certification(int tax_certification) {
        this.tax_certification = tax_certification;
    }

    public String getTax_certification_date() {
        return tax_certification_date;
    }

    public void setTax_certification_date(String tax_certification_date) {
        this.tax_certification_date = tax_certification_date;
    }

    public String getTax_level() {
        return tax_level;
    }

    public void setTax_level(String tax_level) {
        this.tax_level = tax_level;
    }

    public String getMain_products() {
        return main_products;
    }

    public void setMain_products(String main_products) {
        this.main_products = main_products;
    }

    public String getBusiness_place_type() {
        return business_place_type;
    }

    public void setBusiness_place_type(String business_place_type) {
        this.business_place_type = business_place_type;
    }

    public float getBusiness_place_area() {
        return business_place_area;
    }

    public void setBusiness_place_area(float business_place_area) {
        this.business_place_area = business_place_area;
    }

    public int getBusiness_place_term() {
        return business_place_term;
    }

    public void setBusiness_place_term(int business_place_term) {
        this.business_place_term = business_place_term;
    }

    public int getEmployees_amount() {
        return employees_amount;
    }

    public void setEmployees_amount(int employees_amount) {
        this.employees_amount = employees_amount;
    }

    public int getProduction_line_amount() {
        return production_line_amount;
    }

    public void setProduction_line_amount(int production_line_amount) {
        this.production_line_amount = production_line_amount;
    }

    public int getEquipment_amount() {
        return equipment_amount;
    }

    public void setEquipment_amount(int equipment_amount) {
        this.equipment_amount = equipment_amount;
    }

    public int getQualification_certificate() {
        return qualification_certificate;
    }

    public void setQualification_certificate(int qualification_certificate) {
        this.qualification_certificate = qualification_certificate;
    }

    public String getQualification_certificate_type() {
        return qualification_certificate_type;
    }

    public void setQualification_certificate_type(String qualification_certificate_type) {
        this.qualification_certificate_type = qualification_certificate_type;
    }

    public String getCorporate_identity_card() {
        return corporate_identity_card;
    }

    public void setCorporate_identity_card(String corporate_identity_card) {
        this.corporate_identity_card = corporate_identity_card;
    }

    public int getCorporate_age() {
        return corporate_age;
    }

    public void setCorporate_age(int corporate_age) {
        this.corporate_age = corporate_age;
    }

    public String getCorporate_management_level() {
        return corporate_management_level;
    }

    public void setCorporate_management_level(String corporate_management_level) {
        this.corporate_management_level = corporate_management_level;
    }

    public String getMonth_production_capacity() {
        return month_production_capacity;
    }

    public void setMonth_production_capacity(String month_production_capacity) {
        this.month_production_capacity = month_production_capacity;
    }

    public String getAnnual_maximum_capacity() {
        return annual_maximum_capacity;
    }

    public void setAnnual_maximum_capacity(String annual_maximum_capacity) {
        this.annual_maximum_capacity = annual_maximum_capacity;
    }

    public int getProduction_cycle() {
        return production_cycle;
    }

    public void setProduction_cycle(int production_cycle) {
        this.production_cycle = production_cycle;
    }

    public String getProduction_line_status() {
        return production_line_status;
    }

    public void setProduction_line_status(String production_line_status) {
        this.production_line_status = production_line_status;
    }

    public String getManage_province() {
        return manage_province;
    }

    public void setManage_province(String manage_province) {
        this.manage_province = manage_province;
    }

    public String getManage_city() {
        return manage_city;
    }

    public void setManage_city(String manage_city) {
        this.manage_city = manage_city;
    }

    public String getManage_area() {
        return manage_area;
    }

    public void setManage_area(String manage_area) {
        this.manage_area = manage_area;
    }

    public String getManage_address() {
        return manage_address;
    }

    public void setManage_address(String manage_address) {
        this.manage_address = manage_address;
    }

    public String getRegister_province() {
        return register_province;
    }

    public void setRegister_province(String register_province) {
        this.register_province = register_province;
    }

    public String getRegister_city() {
        return register_city;
    }

    public void setRegister_city(String register_city) {
        this.register_city = register_city;
    }

    public String getRegister_area() {
        return register_area;
    }

    public void setRegister_area(String register_area) {
        this.register_area = register_area;
    }

    public String getRegister_address() {
        return register_address;
    }

    public void setRegister_address(String register_address) {
        this.register_address = register_address;
    }

    public List<MddDataList1> getFactory_inspection_list() {
        return factory_inspection_list;
    }

    public void setFactory_inspection_list(List<MddDataList1> factory_inspection_list) {
        this.factory_inspection_list = factory_inspection_list;
    }

    public List<MddDataList1> getEmployee_roster_list() {
        return employee_roster_list;
    }

    public void setEmployee_roster_list(List<MddDataList1> employee_roster_list) {
        this.employee_roster_list = employee_roster_list;
    }

    public List<MddDataList1> getCompany_organize_list() {
        return company_organize_list;
    }

    public void setCompany_organize_list(List<MddDataList1> company_organize_list) {
        this.company_organize_list = company_organize_list;
    }

    public List<MddDataList1> getBrochure_list() {
        return brochure_list;
    }

    public void setBrochure_list(List<MddDataList1> brochure_list) {
        this.brochure_list = brochure_list;
    }

    public List<MddDataList1> getProduct_dir_list() {
        return product_dir_list;
    }

    public void setProduct_dir_list(List<MddDataList1> product_dir_list) {
        this.product_dir_list = product_dir_list;
    }

    public List<MddDataList1> getMain_products_list() {
        return main_products_list;
    }

    public void setMain_products_list(List<MddDataList1> main_products_list) {
        this.main_products_list = main_products_list;
    }

    public List<MddDataList1> getBusiness_licence_list() {
        return business_licence_list;
    }

    public void setBusiness_licence_list(List<MddDataList1> business_licence_list) {
        this.business_licence_list = business_licence_list;
    }

    public List<MddDataList1> getProperty_documents_list() {
        return property_documents_list;
    }

    public void setProperty_documents_list(List<MddDataList1> property_documents_list) {
        this.property_documents_list = property_documents_list;
    }

    public List<MddDataList1> getLease_contract_documents_list() {
        return lease_contract_documents_list;
    }

    public void setLease_contract_documents_list(List<MddDataList1> lease_contract_documents_list) {
        this.lease_contract_documents_list = lease_contract_documents_list;
    }

    public List<MddDataList1> getCorporate_identity_list() {
        return corporate_identity_list;
    }

    public void setCorporate_identity_list(List<MddDataList1> corporate_identity_list) {
        this.corporate_identity_list = corporate_identity_list;
    }

    public List<MddDataList1> getProduct_certification_list() {
        return product_certification_list;
    }

    public void setProduct_certification_list(List<MddDataList1> product_certification_list) {
        this.product_certification_list = product_certification_list;
    }

    public List<MddDataList1> getSystem_certification_list() {
        return system_certification_list;
    }

    public void setSystem_certification_list(List<MddDataList1> system_certification_list) {
        this.system_certification_list = system_certification_list;
    }

    public List<MddDataList1> getHonor_certificate_list() {
        return honor_certificate_list;
    }

    public void setHonor_certificate_list(List<MddDataList1> honor_certificate_list) {
        this.honor_certificate_list = honor_certificate_list;
    }

    public List<MddDataList1> getBuyer_certification_list() {
        return buyer_certification_list;
    }

    public void setBuyer_certification_list(List<MddDataList1> buyer_certification_list) {
        this.buyer_certification_list = buyer_certification_list;
    }

    public List<MddDataList1> getEnterprise_patent_certificate_list() {
        return enterprise_patent_certificate_list;
    }

    public void setEnterprise_patent_certificate_list(List<MddDataList1> enterprise_patent_certificate_list) {
        this.enterprise_patent_certificate_list = enterprise_patent_certificate_list;
    }

    public List<MddDataList1> getManagement_guide_list() {
        return management_guide_list;
    }

    public void setManagement_guide_list(List<MddDataList1> management_guide_list) {
        this.management_guide_list = management_guide_list;
    }

    public List<MddDataList1> getBylaw_list() {
        return bylaw_list;
    }

    public void setBylaw_list(List<MddDataList1> bylaw_list) {
        this.bylaw_list = bylaw_list;
    }

    public List<MddDataList1> getProduction_flow_list() {
        return production_flow_list;
    }

    public void setProduction_flow_list(List<MddDataList1> production_flow_list) {
        this.production_flow_list = production_flow_list;
    }

    public List<MddDataList1> getProgram_file_list() {
        return program_file_list;
    }

    public void setProgram_file_list(List<MddDataList1> program_file_list) {
        this.program_file_list = program_file_list;
    }

    public List<MddDataList1> getWork_instruction_list() {
        return work_instruction_list;
    }

    public void setWork_instruction_list(List<MddDataList1> work_instruction_list) {
        this.work_instruction_list = work_instruction_list;
    }

    public List<MddDataList1> getStaff_records_list() {
        return staff_records_list;
    }

    public void setStaff_records_list(List<MddDataList1> staff_records_list) {
        this.staff_records_list = staff_records_list;
    }

    public List<MddDataList1> getTraining_records_list() {
        return training_records_list;
    }

    public void setTraining_records_list(List<MddDataList1> training_records_list) {
        this.training_records_list = training_records_list;
    }

    public List<MddDataList1> getThree_months_attendance_records_list() {
        return three_months_attendance_records_list;
    }

    public void setThree_months_attendance_records_list(List<MddDataList1> three_months_attendance_records_list) {
        this.three_months_attendance_records_list = three_months_attendance_records_list;
    }

    public List<MddDataList1> getThree_months_salary_list() {
        return three_months_salary_list;
    }

    public void setThree_months_salary_list(List<MddDataList1> three_months_salary_list) {
        this.three_months_salary_list = three_months_salary_list;
    }

    public List<MddDataList1> getOne_year_tax_return_list() {
        return one_year_tax_return_list;
    }

    public void setOne_year_tax_return_list(List<MddDataList1> one_year_tax_return_list) {
        this.one_year_tax_return_list = one_year_tax_return_list;
    }

    public List<MddDataList1> getOne_year_order_list() {
        return one_year_order_list;
    }

    public void setOne_year_order_list(List<MddDataList1> one_year_order_list) {
        this.one_year_order_list = one_year_order_list;
    }

    public List<MddDataList1> getThree_months_payment_vouchers_list() {
        return three_months_payment_vouchers_list;
    }

    public void setThree_months_payment_vouchers_list(List<MddDataList1> three_months_payment_vouchers_list) {
        this.three_months_payment_vouchers_list = three_months_payment_vouchers_list;
    }

    public List<MddDataList1> getThree_months_electricity_payment_list() {
        return three_months_electricity_payment_list;
    }

    public void setThree_months_electricity_payment_list(List<MddDataList1> three_months_electricity_payment_list) {
        this.three_months_electricity_payment_list = three_months_electricity_payment_list;
    }

    public List<MddDataList1> getRaw_material_input_invoice_list() {
        return raw_material_input_invoice_list;
    }

    public void setRaw_material_input_invoice_list(List<MddDataList1> raw_material_input_invoice_list) {
        this.raw_material_input_invoice_list = raw_material_input_invoice_list;
    }

    public List<MddDataList1> getRaw_material_warehouse_record_list() {
        return raw_material_warehouse_record_list;
    }

    public void setRaw_material_warehouse_record_list(List<MddDataList1> raw_material_warehouse_record_list) {
        this.raw_material_warehouse_record_list = raw_material_warehouse_record_list;
    }

    public List<MddDataList1> getFinished_goods_in_warehouse_list() {
        return finished_goods_in_warehouse_list;
    }

    public void setFinished_goods_in_warehouse_list(List<MddDataList1> finished_goods_in_warehouse_list) {
        this.finished_goods_in_warehouse_list = finished_goods_in_warehouse_list;
    }

    public List<MddDataList1> getOcean_logistics_list() {
        return ocean_logistics_list;
    }

    public void setOcean_logistics_list(List<MddDataList1> ocean_logistics_list) {
        this.ocean_logistics_list = ocean_logistics_list;
    }

    public List<MddDataList1> getProduction_plan_list() {
        return production_plan_list;
    }

    public void setProduction_plan_list(List<MddDataList1> production_plan_list) {
        this.production_plan_list = production_plan_list;
    }

    public List<MddDataList1> getProduction_statement_list() {
        return production_statement_list;
    }

    public void setProduction_statement_list(List<MddDataList1> production_statement_list) {
        this.production_statement_list = production_statement_list;
    }

    public List<MddDataList1> getQuality_inspection_record_list() {
        return quality_inspection_record_list;
    }

    public void setQuality_inspection_record_list(List<MddDataList1> quality_inspection_record_list) {
        this.quality_inspection_record_list = quality_inspection_record_list;
    }

    public List<MddDataList1> getFactory_gate_list() {
        return factory_gate_list;
    }

    public void setFactory_gate_list(List<MddDataList1> factory_gate_list) {
        this.factory_gate_list = factory_gate_list;
    }

    public List<MddDataList1> getFactory_main_building_list() {
        return factory_main_building_list;
    }

    public void setFactory_main_building_list(List<MddDataList1> factory_main_building_list) {
        this.factory_main_building_list = factory_main_building_list;
    }

    public List<MddDataList1> getOffice_area_list() {
        return office_area_list;
    }

    public void setOffice_area_list(List<MddDataList1> office_area_list) {
        this.office_area_list = office_area_list;
    }

    public List<MddDataList1> getSample_room_list() {
        return sample_room_list;
    }

    public void setSample_room_list(List<MddDataList1> sample_room_list) {
        this.sample_room_list = sample_room_list;
    }

    public List<MddDataList1> getProducing_departments_list() {
        return producing_departments_list;
    }

    public void setProducing_departments_list(List<MddDataList1> producing_departments_list) {
        this.producing_departments_list = producing_departments_list;
    }

    public List<MddDataList1> getRaw_materials_warehouse_list() {
        return raw_materials_warehouse_list;
    }

    public void setRaw_materials_warehouse_list(List<MddDataList1> raw_materials_warehouse_list) {
        this.raw_materials_warehouse_list = raw_materials_warehouse_list;
    }

    public List<MddDataList1> getFinished_goods_warehouse_list() {
        return finished_goods_warehouse_list;
    }

    public void setFinished_goods_warehouse_list(List<MddDataList1> finished_goods_warehouse_list) {
        this.finished_goods_warehouse_list = finished_goods_warehouse_list;
    }

    public List<MddDataList1> getFinished_product_room_list() {
        return finished_product_room_list;
    }

    public void setFinished_product_room_list(List<MddDataList1> finished_product_room_list) {
        this.finished_product_room_list = finished_product_room_list;
    }

    public List<MddDataList1> getStaff_dormitory_building_list() {
        return staff_dormitory_building_list;
    }

    public void setStaff_dormitory_building_list(List<MddDataList1> staff_dormitory_building_list) {
        this.staff_dormitory_building_list = staff_dormitory_building_list;
    }

    public List<MddDataList1> getCanteen_list() {
        return canteen_list;
    }

    public void setCanteen_list(List<MddDataList1> canteen_list) {
        this.canteen_list = canteen_list;
    }

    public List<MddDataList1> getEntertainment_place_list() {
        return entertainment_place_list;
    }

    public void setEntertainment_place_list(List<MddDataList1> entertainment_place_list) {
        this.entertainment_place_list = entertainment_place_list;
    }

    public List<MddDataList1> getInfirmary_list() {
        return infirmary_list;
    }

    public void setInfirmary_list(List<MddDataList1> infirmary_list) {
        this.infirmary_list = infirmary_list;
    }

    public List<MddDataList2> getProduction_equipmentlist_list() {
        return production_equipmentlist_list;
    }

    public void setProduction_equipmentlist_list(List<MddDataList2> production_equipmentlist_list) {
        this.production_equipmentlist_list = production_equipmentlist_list;
    }

    public List<MddDataList1> getProduction_equipment_list() {
        return production_equipment_list;
    }

    public void setProduction_equipment_list(List<MddDataList1> production_equipment_list) {
        this.production_equipment_list = production_equipment_list;
    }

    public List<MddDataList1> getSafety_list() {
        return safety_list;
    }

    public void setSafety_list(List<MddDataList1> safety_list) {
        this.safety_list = safety_list;
    }

    public List<MddDataList1> getInsider_list() {
        return insider_list;
    }

    public void setInsider_list(List<MddDataList1> insider_list) {
        this.insider_list = insider_list;
    }

    public List<MddDataList1> getOutsiders_list() {
        return outsiders_list;
    }

    public void setOutsiders_list(List<MddDataList1> outsiders_list) {
        this.outsiders_list = outsiders_list;
    }

    public String getCompany_base_info() {
        return company_base_info;
    }

    public void setCompany_base_info(String company_base_info) {
        this.company_base_info = company_base_info;
    }

    public int getProduct_department_people() {
        return product_department_people;
    }

    public void setProduct_department_people(int product_department_people) {
        this.product_department_people = product_department_people;
    }

    public int getAdministrative_logistics_people() {
        return administrative_logistics_people;
    }

    public void setAdministrative_logistics_people(int administrative_logistics_people) {
        this.administrative_logistics_people = administrative_logistics_people;
    }

    public int getTemporary_people() {
        return temporary_people;
    }

    public void setTemporary_people(int temporary_people) {
        this.temporary_people = temporary_people;
    }

    public int getHigh_intermediate_people() {
        return high_intermediate_people;
    }

    public void setHigh_intermediate_people(int high_intermediate_people) {
        this.high_intermediate_people = high_intermediate_people;
    }

    public int getDevelopment_people() {
        return development_people;
    }

    public void setDevelopment_people(int development_people) {
        this.development_people = development_people;
    }

    public String getHardware() {
        return hardware;
    }

    public void setHardware(String hardware) {
        this.hardware = hardware;
    }

    public float getDomestic_sales_ratio() {
        return domestic_sales_ratio;
    }

    public void setDomestic_sales_ratio(float domestic_sales_ratio) {
        this.domestic_sales_ratio = domestic_sales_ratio;
    }

    public float getExport_proportion_ratio() {
        return export_proportion_ratio;
    }

    public void setExport_proportion_ratio(float export_proportion_ratio) {
        this.export_proportion_ratio = export_proportion_ratio;
    }

    public String getMainly_sold() {
        return mainly_sold;
    }

    public void setMainly_sold(String mainly_sold) {
        this.mainly_sold = mainly_sold;
    }
}
