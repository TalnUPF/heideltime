

/* First created by JCasGen Thu Sep 20 15:38:13 CEST 2012 */
package de.unihd.dbs.uima.types.heideltime;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;



import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence;


/** 
 * Updated by JCasGen Fri Apr 16 15:06:21 CEST 2021
 * XML source: D:/treball/repos/heideltime/src/main/resources/desc/type/HeidelTime_TypeSystem.xml
 * @generated */
public class IntervalCandidateSentence extends Sentence {
  /** @generated
   * @ordered 
   */
  public final static int typeIndexID = JCasRegistry.register(IntervalCandidateSentence.class);
  /** @generated
   * @ordered 
   */
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected IntervalCandidateSentence() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public IntervalCandidateSentence(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public IntervalCandidateSentence(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public IntervalCandidateSentence(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
}

    