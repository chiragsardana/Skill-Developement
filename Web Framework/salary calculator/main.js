function calc()
    {
        var bp,DA,HRA,GP,PF,Tax,Deduction,NetPay;
        bp = parseInt(document.form1.bp.value);

        DA = bp * 0.5;
        HRA = bp * 0.5;
        GP = bp + DA + HRA;
        PF = GP * 0.02;
        Tax = GP * 0.01;
        Deduction = Tax + PF;
        NetPay = GP - Deduction;

        document.form1.da.value = DA;
        document.form1.hra.value = HRA;
        document.form1.gp.value = GP;
        document.form1.pf.value = PF;
        document.form1.tax.value = Tax;
        document.form1.deduction.value = Deduction;
        document.form1.netpay.value = NetPay
    }