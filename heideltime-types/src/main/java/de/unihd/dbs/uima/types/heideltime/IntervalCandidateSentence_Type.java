
/* First created by JCasGen Wed May 26 12:16:57 CEST 2021 */
package de.unihd.dbs.uima.types.heideltime;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import de.tudarmstadt.ukp.dkpro.core.api.segmentation.type.Sentence_Type;

/** 
 * Updated by JCasGen Wed May 26 12:16:57 CEST 2021
 * @generated */
public class IntervalCandidateSentence_Type extends Sentence_Type {
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = IntervalCandidateSentence.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("de.unihd.dbs.uima.types.heideltime.IntervalCandidateSentence");



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public IntervalCandidateSentence_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

  }
}



    