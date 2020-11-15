//package com.company.Builder;
//
//class Admin extends Builder {
//    public Admin(){
//        role = new Role();
//    }
//    @Override
//    public Role getAccess() {
//        role.prepare();
//        role.insertMotherboard();
//        CPU cpu = new IntelCPU();
//        role.insertCPU(cpu);
//        System.out.println("1st PC is done");
//        role.insertMotherboard();
//        cpu = new AMDCPU();
//        role.insertCPU(cpu);
//        System.out.println("2nd PC is done");
//        return role;
//    }
//}
