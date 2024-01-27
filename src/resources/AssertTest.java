package resources;

import org.junit.jupiter.api.Assertions;
import org.opentest4j.AssertionFailedError;

/**
 *
 */
public class AssertTest extends Assertions{
    protected AssertTest(){
    }

    public static void assertIsEqual(final TreeNode root1, final TreeNode root2){
        boolean isTrue = isEqual(root1, root2);
        if(isTrue){
            assertTrue(isTrue);
        }else{
            assertFalse(isTrue);
        }
    }

    private static boolean isEqual(TreeNode root1, TreeNode root2){
        if(root1 != null && root2 != null){
            if(root1.val != root2.val){
                return false;
            }else{
                return isEqual(root1.left, root2.left) && isEqual(root1.right, root2.right);
            }
        }else return (root1 == null || root2 != null) && (root1 != null || root2 == null);
    }

//    public static void assertIsEqual(final TreeNode root1, final TreeNode root2){
//        if(root1 == null && root2 == null){
//            equals(root1, root2);
//        }else{
//        if((root1 == null && root2 != null)){
////            equals(root2, root1);
//                failNotEqual(root1, root2);
//            }else if((root1 != null && root2 == null)){
////                equals(root1, root2);
//            failNotEqual(root1, root2);
//            }else{
//                equals(root1.val, root2.val);
//                if(root1.left != null && root2.left != null){
//                    assertIsEqual(root1.left, root2.left);
////            }else{
////                equals(root1.left, root2.left);
//                }
//                if(root1.right != null && root2.right != null){
//                    assertIsEqual(root1.right, root2.right);
////            }else{
////                equals(root1.right, root2.right);
//                }
//            }
//        }
//
////        if(root1 == null && root2 == null){
////            equals(root1, root2);
////        }else if(root1 != null && root2 != null){
////            equals(root1.val, root2.val);
////            if(root1.left != null && root2.left != null){
////                assertIsEqual(root1.left, root2.left);
//////            }else{
//////                equals(root1.left, root2.left);
////            }
////            if(root1.right != null && root2.right != null){
////                assertIsEqual(root1.right, root2.right);
//////            }else{
//////                equals(root1.right, root2.right);
////            }
////        }else{
////            failNotEqual(root1, root2);
////        }
//    }

    static void equals(Object expected, Object actual){
        if(!objectsAreEqual(expected, actual)){
            failNotEqual(expected, actual);
        }
    }

    static void failNotEqual(Object expected, Object actual){
        fail((String)null, expected, actual);
    }

    static void fail(String message, Object expected, Object actual){
        throw new AssertionFailedError(message, expected, actual);
    }

    static boolean objectsAreEqual(Object obj1, Object obj2){
        if(obj1 == null){
            return obj2 == null;
        }else{
            return obj1.equals(obj2);
        }
    }
}
