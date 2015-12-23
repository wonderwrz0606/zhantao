package bean;
// default package

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


/**
 * School entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name="t_school"
    ,catalog="sql5100650"
)

public class School  implements java.io.Serializable {


    // Fields    

     private Integer schId;
     private String schName;
     private String schWebsite;
     private Date deadline;
     private String schGrade;
     private Integer schEst;
     private Integer schCap;
     private String schPtRatio;
     private String schStreet;
     private String schCity;
     private String schState;
     private String schZip;
     private Integer schSat;
     private Integer schTf;
     private Integer schEsl;
     private Integer schChnPop;
     private Integer schDeps;
     private Integer schFee;
     private Integer totalFee;
     private String schDes;
     private String schGroup;
     private String schReligon;
     private String schType;
     private Integer schResFee;
     private Date schStartDate;
     private String comment;
     private Set<Application> applications = new HashSet<Application>(0);


    // Constructors

    /** default constructor */
    public School() {
    }

    
    /** full constructor */
    public School(String schName, String schWebsite, Date deadline, String schGrade, Integer schEst, Integer schCap, String schPtRatio, String schStreet, String schCity, String schState, String schZip, Integer schSat, Integer schTf, Integer schEsl, Integer schChnPop, Integer schDeps, Integer schFee, Integer totalFee, String schDes, String schGroup, String schReligon, String schType, Integer schResFee, Date schStartDate, String comment, Set<Application> applications) {
        this.schName = schName;
        this.schWebsite = schWebsite;
        this.deadline = deadline;
        this.schGrade = schGrade;
        this.schEst = schEst;
        this.schCap = schCap;
        this.schPtRatio = schPtRatio;
        this.schStreet = schStreet;
        this.schCity = schCity;
        this.schState = schState;
        this.schZip = schZip;
        this.schSat = schSat;
        this.schTf = schTf;
        this.schEsl = schEsl;
        this.schChnPop = schChnPop;
        this.schDeps = schDeps;
        this.schFee = schFee;
        this.totalFee = totalFee;
        this.schDes = schDes;
        this.schGroup = schGroup;
        this.schReligon = schReligon;
        this.schType = schType;
        this.schResFee = schResFee;
        this.schStartDate = schStartDate;
        this.comment = comment;
        this.applications = applications;
    }

   
    // Property accessors
    @Id @GeneratedValue
    
    @Column(name="sch_id", unique=true, nullable=false)

    public Integer getSchId() {
        return this.schId;
    }
    
    public void setSchId(Integer schId) {
        this.schId = schId;
    }
    
    @Column(name="sch_name", length=45)

    public String getSchName() {
        return this.schName;
    }
    
    public void setSchName(String schName) {
        this.schName = schName;
    }
    
    @Column(name="sch_website", length=45)

    public String getSchWebsite() {
        return this.schWebsite;
    }
    
    public void setSchWebsite(String schWebsite) {
        this.schWebsite = schWebsite;
    }
    
    @Column(name="deadline", length=0)

    public Date getDeadline() {
        return this.deadline;
    }
    
    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }
    
    @Column(name="sch_grade", length=45)

    public String getSchGrade() {
        return this.schGrade;
    }
    
    public void setSchGrade(String schGrade) {
        this.schGrade = schGrade;
    }
    
    @Column(name="sch_Est")

    public Integer getSchEst() {
        return this.schEst;
    }
    
    public void setSchEst(Integer schEst) {
        this.schEst = schEst;
    }
    
    @Column(name="sch_cap")

    public Integer getSchCap() {
        return this.schCap;
    }
    
    public void setSchCap(Integer schCap) {
        this.schCap = schCap;
    }
    
    @Column(name="sch_pt_ratio", length=45)

    public String getSchPtRatio() {
        return this.schPtRatio;
    }
    
    public void setSchPtRatio(String schPtRatio) {
        this.schPtRatio = schPtRatio;
    }
    
    @Column(name="sch_street", length=45)

    public String getSchStreet() {
        return this.schStreet;
    }
    
    public void setSchStreet(String schStreet) {
        this.schStreet = schStreet;
    }
    
    @Column(name="sch_city", length=45)

    public String getSchCity() {
        return this.schCity;
    }
    
    public void setSchCity(String schCity) {
        this.schCity = schCity;
    }
    
    @Column(name="sch_state", length=45)

    public String getSchState() {
        return this.schState;
    }
    
    public void setSchState(String schState) {
        this.schState = schState;
    }
    
    @Column(name="sch_zip", length=45)

    public String getSchZip() {
        return this.schZip;
    }
    
    public void setSchZip(String schZip) {
        this.schZip = schZip;
    }
    
    @Column(name="sch_Sat")

    public Integer getSchSat() {
        return this.schSat;
    }
    
    public void setSchSat(Integer schSat) {
        this.schSat = schSat;
    }
    
    @Column(name="sch_TF")

    public Integer getSchTf() {
        return this.schTf;
    }
    
    public void setSchTf(Integer schTf) {
        this.schTf = schTf;
    }
    
    @Column(name="sch_Esl")

    public Integer getSchEsl() {
        return this.schEsl;
    }
    
    public void setSchEsl(Integer schEsl) {
        this.schEsl = schEsl;
    }
    
    @Column(name="sch_chn_pop")

    public Integer getSchChnPop() {
        return this.schChnPop;
    }
    
    public void setSchChnPop(Integer schChnPop) {
        this.schChnPop = schChnPop;
    }
    
    @Column(name="sch_deps")

    public Integer getSchDeps() {
        return this.schDeps;
    }
    
    public void setSchDeps(Integer schDeps) {
        this.schDeps = schDeps;
    }
    
    @Column(name="sch_fee")

    public Integer getSchFee() {
        return this.schFee;
    }
    
    public void setSchFee(Integer schFee) {
        this.schFee = schFee;
    }
    
    @Column(name="total_fee")

    public Integer getTotalFee() {
        return this.totalFee;
    }
    
    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }
    
    @Column(name="sch_des", length=45)

    public String getSchDes() {
        return this.schDes;
    }
    
    public void setSchDes(String schDes) {
        this.schDes = schDes;
    }
    
    @Column(name="sch_group", length=45)

    public String getSchGroup() {
        return this.schGroup;
    }
    
    public void setSchGroup(String schGroup) {
        this.schGroup = schGroup;
    }
    
    @Column(name="sch_religon", length=45)

    public String getSchReligon() {
        return this.schReligon;
    }
    
    public void setSchReligon(String schReligon) {
        this.schReligon = schReligon;
    }
    
    @Column(name="sch_type", length=45)

    public String getSchType() {
        return this.schType;
    }
    
    public void setSchType(String schType) {
        this.schType = schType;
    }
    
    @Column(name="sch_res_fee")

    public Integer getSchResFee() {
        return this.schResFee;
    }
    
    public void setSchResFee(Integer schResFee) {
        this.schResFee = schResFee;
    }
    
    @Column(name="sch_start_date", length=0)

    public Date getSchStartDate() {
        return this.schStartDate;
    }
    
    public void setSchStartDate(Date schStartDate) {
        this.schStartDate = schStartDate;
    }
    
    @Column(name="comment", length=45)

    public String getComment() {
        return this.comment;
    }
    
    public void setComment(String comment) {
        this.comment = comment;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="school")

    public Set<Application> getApplications() {
        return this.applications;
    }
    
    public void setApplications(Set<Application> applications) {
        this.applications = applications;
    }
   








}